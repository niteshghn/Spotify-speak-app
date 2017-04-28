package com.nitesh.spotifyspeech;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
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
import com.spotify.sdk.android.authentication.SpotifyNativeAuthUtil;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_RECORD_AUDIO = 1;
    private static final int REQUEST_CODE = 200;
    private Button speakbtn, loginbtn;
    private static AudioManager audioManager;
    private boolean startspeech = true;
    private String CLIENT_ID = "16c55230e01c4889a4d7911362bb9f19";
    private String REDIRECT_URI = "http://localhost:8888/callback";


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
                            new String[]{Manifest.permission.RECORD_AUDIO},
                            MY_PERMISSIONS_REQUEST_RECORD_AUDIO);

                    // MY_PERMISSIONS_REQUEST_RECORD_AUDIO is an
                    // app-defined int constant. The callback method gets the
                    // result of the request.
//                    }
                }
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AuthenticationRequest.Builder builder =
                        new AuthenticationRequest.Builder(CLIENT_ID, AuthenticationResponse.Type.TOKEN, REDIRECT_URI);

                builder.setScopes(new String[]{"streaming"});
                AuthenticationRequest request = builder.build();

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
//            speechTv.setText(matches.get(0));
//            setQuestion(num, matches.get(0));
                // the recording url is in getData:
//            Uri audioUri = data.getData();
//            ContentResolver contentResolver = getContentResolver();
//            try {
//                InputStream filestream = contentResolver.openInputStream(audioUri);
//                File file = new File(mFileName);
//                AppUtils.copyInputStreamToFile(filestream, file);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            if (num < 5) {
//                showNextQuestion();
//                startAssessmentAudio();
//            } else {
//                ++num;
//            }
//            if (num == 6) {
//                nextTv.setVisibility(View.VISIBLE);
//                nextTv.setText("FINISH");
//            }
            } else {
//            unMuteAll();
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
                    track.getHref();
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
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_RECORD_AUDIO: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    startSpeechToText();
                } else {
                    Toast.makeText(HomeActivity.this, "Please grant permission", Toast.LENGTH_LONG).show();
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
}
