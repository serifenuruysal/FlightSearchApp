package com.soulkitchen.serifenuruysal.flightsearchapp;

import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SessionResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SkyResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by S.Nur Uysal on 26.11.2018.
 */
public interface ApiService {

    @POST("/apiservices/pricing/v1.0/")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    Call<SessionResponse> getSession(@Body String parm);

    @GET("/apiservices/pricing/uk1/v1.0/{session_id_url}")
    Call<SkyResponse> getDetail(@Path(value = "session_id_url") String sessionId,@QueryMap Map<String, String> params);

}
