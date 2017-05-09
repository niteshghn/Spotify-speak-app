package com.nitesh.spotifyspeech;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by niteshverma on 28/04/17.
 */

public interface ApiService {

    @GET("search")
    Call<SearchResponse> getSearch(@Query("q") String query, @Query("type") String type);

}
