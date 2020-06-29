package com.example.bhavproject.MVVMPattern;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectRepository {
    private static final String TAG = "ProjectRepository";

    public static LiveData<CustomerTrackingResponse> getDataList() {
        RestApiService apiService = RetrofitInstance.getApiService();
        Call<CustomerTrackingResponse> call = apiService.getAllStates();
        final MutableLiveData<CustomerTrackingResponse> data = new MutableLiveData<>();
        call.enqueue(new Callback<CustomerTrackingResponse>() {
            @Override
            public void onResponse(Call<CustomerTrackingResponse> call, Response<CustomerTrackingResponse> response) {

                if (response.body()!=null){
                    data.setValue(response.body());
                    Log.d(TAG, "onResponse: success");
                }
            }

            @Override
            public void onFailure(Call<CustomerTrackingResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: failed");
            }
        });
        return data;
    }
}

