package com.soulkitchen.serifenuruysal.flightsearchapp;

import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SessionResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.Utils;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by S.Nur Uysal on 26.11.2018.
 */
public class ApiClient {
    private static final String TAG = "ApiClient";
    public static final String BASE_URL = "http://partners.api.skyscanner.net/";
    private static final OkHttpClient client;
    private static ApiService mService;
    static {

        client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new AuthInterceptor())
                .build();



    }
    public static ApiService getInstance() {
        synchronized (new Object()) {
            if (mService == null) {
                mService = getRetrofitInstance().create(ApiService.class);
            }
            return mService;
        }
    }


    public static void getSession(Callback<SessionResponse> callback) {

            if (mService == null) {
                mService = getRetrofitInstance().create(ApiService.class);
            }
            mService.getSession(Utils.getDefaultBodyParamaters()).enqueue(callback);

    }

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static class AuthInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {

            Request request = chain.request();

            HttpUrl url = request.url().newBuilder()
                    .addQueryParameter("apikey", BuildConfig.API_KEY)
                    .build();

            request = request.newBuilder().url(url).build();
            return chain.proceed(request);
        }


    }
}
