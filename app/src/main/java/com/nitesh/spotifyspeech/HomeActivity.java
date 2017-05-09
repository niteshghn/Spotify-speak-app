package com.nitesh.spotifyspeech;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.speech.RecognizerIntent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
import com.spotify.sdk.android.player.Config;
import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Connectivity;
import com.spotify.sdk.android.player.Error;
import com.spotify.sdk.android.player.PlaybackState;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerEvent;
import com.spotify.sdk.android.player.Spotify;
import com.spotify.sdk.android.player.SpotifyPlayer;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity implements Player.NotificationCallback, ConnectionStateCallback {

    private static final int MULTIPLE_PERMISSION_CODE = 1;
    private static final int REQUEST_CODE = 200;
    private Button speakbtn, loginbtn;
    private static AudioManager audioManager;
    private boolean startspeech = true;
    private String CLIENT_ID = "16c55230e01c4889a4d7911362bb9f19";
    private String REDIRECT_URI = "http://localhost:8888/callback";
    private SpotifyPlayer mPlayer;
    private PlaybackState mCurrentPlaybackState;
    private BroadcastReceiver mNetworkStateReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        speakbtn = (Button) findViewById(R.id.speakbtn);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        speakbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int permissionCheck = ContextCompat.checkSelfPermission(HomeActivity.this,
                        Manifest.permission.RECORD_AUDIO);
                if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
                    Log.e("speech", "onclick");
                    if (startspeech) {
                        Log.e("speech", "start-true");
                        startSpeechToText();
                    }
                } else { // ask permission
                    // Should we show an explanation?
//                    if (ActivityCompat.shouldShowRequestPermissionRationale(HomeActivity.this,
//                            Manifest.permission.RECORD_AUDIO)) {
//
//                        // Show an explanation to the user *asynchronously* -- don't block
//                        // this thread waiting for the user's response! After the user
//                        // sees the explanation, try again to request the permission.
//
//                    } else {

                    // No explanation needed, we can request the permission.

                    ActivityCompat.requestPermissions(HomeActivity.this,
                            new String[]{Manifest.permission.RECORD_AUDIO,Manifest.permission.ACCESS_NETWORK_STATE},
                            MULTIPLE_PERMISSION_CODE);

                    // MULTIPLE_PERMISSION_CODE is an
                    // app-defined int constant. The callback method gets the
                    // result of the request.
//                    }
                }
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AuthenticationRequest request = new AuthenticationRequest.Builder(CLIENT_ID, AuthenticationResponse.Type.TOKEN, REDIRECT_URI)
                        .setScopes(new String[]{"user-read-private", "playlist-read", "playlist-read-private", "streaming"})
                        .build();

                AuthenticationClient.openLoginActivity(HomeActivity.this, REQUEST_CODE, request);
            }
        });
    }

    private void startSpeechToText() {
        startspeech = false;
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getApplication().getPackageName());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "say something");
        intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 2);
        intent.putExtra("android.speech.extra.GET_AUDIO_FORMAT", "audio/AMR");
        intent.putExtra("android.speech.extra.GET_AUDIO", true);
        startActivityForResult(intent, 900);
    }

    private void muteallSound() {
        audioManager.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
        audioManager.setStreamMute(AudioManager.STREAM_ALARM, true);
        audioManager.setStreamMute(AudioManager.STREAM_MUSIC, true);
        audioManager.setStreamMute(AudioManager.STREAM_RING, true);
        audioManager.setStreamMute(AudioManager.STREAM_SYSTEM, true);
    }

    private void unMuteAll() {
        audioManager.setStreamMute(AudioManager.STREAM_NOTIFICATION, false);
        audioManager.setStreamMute(AudioManager.STREAM_ALARM, false);
        audioManager.setStreamMute(AudioManager.STREAM_MUSIC, false);
        audioManager.setStreamMute(AudioManager.STREAM_RING, false);
        audioManager.setStreamMute(AudioManager.STREAM_SYSTEM, false);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Check if result comes from the correct activity
        if (requestCode == REQUEST_CODE) {
            AuthenticationResponse response = AuthenticationClient.getResponse(resultCode, data);
            switch (response.getType()) {
                // Response was successful and contains auth token
                case TOKEN:
                    // Handle successful response
                    loginbtn.setVisibility(View.GONE);
                    speakbtn.setVisibility(View.VISIBLE);
                    onAuthenticationComplete(response);
                    break;
                // Auth flow returned an error
                case ERROR:
                    // Handle error response
                    break;

                // Most likely auth flow was cancelled
                default:
                    // Handle other cases
            }
        } else {
            if (data != null) {
//            unMuteAll();
                startspeech = true;
                Bundle bundle = data.getExtras();
//            playIv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.play));
                ArrayList<String> matches = bundle.getStringArrayList(RecognizerIntent.EXTRA_RESULTS);
                Log.e("OnActivityResult", matches.get(0));
                hitSpotifyAPIForMusic(matches.get(0));
            } else {
                startspeech = true;
            }
        }
    }

    private void hitSpotifyAPIForMusic(String text) {
        SpotifyClient spotifyClient = new SpotifyClient();
        Call<SearchResponse> call = spotifyClient.getApiService().getSearch(text, "track");
        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                if (response != null) {
                    SearchResponse response1 = response.body();
                    SearchResponse.TracksBean.ItemsBean track = response1.getTracks().getItems().get(0);
                    String uri = track.getUri();
                    Log.e("nitesh", "Starting playback for " + uri);
                    mPlayer.playUri(mOperationCallback, uri, 0, 0);
                }
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {
                if (t != null)
                    Log.e("failed", t.getMessage());
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MULTIPLE_PERMISSION_CODE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    startSpeechToText();
                } else {
                    Toast.makeText(HomeActivity.this, "Please grant all permission", Toast.LENGTH_LONG).show();
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
            }
        }
    }

    private final Player.OperationCallback mOperationCallback = new Player.OperationCallback() {
        @Override
        public void onSuccess() {
            Log.e("nitesh", "OK!");
        }

        @Override
        public void onError(Error error) {
            Log.e("nitesh", "ERROR:" + error);
        }
    };

    @Override
    protected void onResume() {
        super.onResume();

        // Set up the broadcast receiver for network events. Note that we also unregister
        // this receiver again in onPause().
        mNetworkStateReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (mPlayer != null) {
                    Connectivity connectivity = getNetworkConnectivity(getBaseContext());
                    Log.e("nitesh", "Network state changed: " + connectivity.toString());
                    mPlayer.setConnectivityStatus(mOperationCallback, connectivity);
                }
            }
        };

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mNetworkStateReceiver, filter);

        if (mPlayer != null) {
            mPlayer.addNotificationCallback(HomeActivity.this);
            mPlayer.addConnectionStateCallback(HomeActivity.this);
        }
    }

    @Override
    public void onPlaybackEvent(PlayerEvent playerEvent) {

    }

    @Override
    public void onPlaybackError(Error error) {

    }

    @Override
    public void onLoggedIn() {
        showLogin(false);
    }

    @Override
    public void onLoggedOut() {
        showLogin(true);
    }

    private void showLogin(boolean b) {
        if (b) {
            loginbtn.setVisibility(View.VISIBLE);
            speakbtn.setVisibility(View.GONE);
        }else {
            loginbtn.setVisibility(View.GONE);
            speakbtn.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onLoginFailed(Error error) {
        Log.e("nitesh","login failed--"+error.name());
    }

    @Override
    public void onTemporaryError() {
        Log.e("nitesh","temporarily error");
    }

    @Override
    public void onConnectionMessage(String s) {

    }

    private void onAuthenticationComplete(AuthenticationResponse authResponse) {
        // Once we have obtained an authorization token, we can proceed with creating a Player.
        Log.e("nitesh", "Got authentication token");
        if (mPlayer == null) {
            Config playerConfig = new Config(getApplicationContext(), authResponse.getAccessToken(), CLIENT_ID);
            // Since the Player is a static singleton owned by the Spotify class, we pass "this" as
            // the second argument in order to refcount it properly. Note that the method
            // Spotify.destroyPlayer() also takes an Object argument, which must be the same as the
            // one passed in here. If you pass different instances to Spotify.getPlayer() and
            // Spotify.destroyPlayer(), that will definitely result in resource leaks.
            mPlayer = Spotify.getPlayer(playerConfig, this, new SpotifyPlayer.InitializationObserver() {
                @Override
                public void onInitialized(SpotifyPlayer player) {
                    Log.e("nitesh", "-- Player initialized --");
                    mPlayer.setConnectivityStatus(mOperationCallback, getNetworkConnectivity(HomeActivity.this));
                    mPlayer.addNotificationCallback(HomeActivity.this);
                    mPlayer.addConnectionStateCallback(HomeActivity.this);
                    // Trigger UI refresh
//                    updateView();
                }

                @Override
                public void onError(Throwable error) {
                    Log.e("nitesh", "Error in initialization: " + error.getMessage());
                }
            });
        } else {
            mPlayer.login(authResponse.getAccessToken());
        }
    }

    private Connectivity getNetworkConnectivity(Context context) {
        ConnectivityManager connectivityManager;
        connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        if (activeNetwork != null && activeNetwork.isConnected()) {
            return Connectivity.fromNetworkType(activeNetwork.getType());
        } else {
            return Connectivity.OFFLINE;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mNetworkStateReceiver);

        // Note that calling Spotify.destroyPlayer() will also remove any callbacks on whatever
        // instance was passed as the refcounted owner. So in the case of this particular example,
        // it's not strictly necessary to call these methods, however it is generally good practice
        // and also will prevent your application from doing extra work in the background when
        // paused.
        if (mPlayer != null) {
            mPlayer.removeNotificationCallback(HomeActivity.this);
            mPlayer.removeConnectionStateCallback(HomeActivity.this);
        }
    }
}

