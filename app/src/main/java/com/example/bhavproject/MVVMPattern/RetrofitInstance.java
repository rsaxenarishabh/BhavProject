package com.example.bhavproject.MVVMPattern;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created on : Feb 25, 2019
 * Author     : AndroidWave
 */
public class RetrofitInstance {
    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://furoapi.tk/api/";

    public static RestApiService getApiService() {
        if (retrofit == null) {

            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(RestApiService.class);

    }

}