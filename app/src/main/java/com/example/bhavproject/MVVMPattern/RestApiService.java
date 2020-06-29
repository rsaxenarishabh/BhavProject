package com.example.bhavproject.MVVMPattern;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApiService {

    @GET("all-activities")
    Call<CustomerTrackingResponse> getAllStates();


    @POST("club-details")
    Call<ClubResponse> getDetails();
}