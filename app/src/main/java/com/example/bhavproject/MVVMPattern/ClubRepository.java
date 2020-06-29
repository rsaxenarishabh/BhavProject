package com.example.bhavproject.MVVMPattern;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClubRepository {
    private static final String TAG = "ClubRepository";


    public static LiveData<ClubResponse> getClubList(){
        RestApiService apiService = RetrofitInstance.getApiService();
        Call<ClubResponse> call = apiService.getDetails();
        final MutableLiveData<ClubResponse> data = new MutableLiveData<>();
        call.enqueue(new Callback<ClubResponse>() {
            @Override
            public void onResponse(Call<ClubResponse> call, Response<ClubResponse> response) {

                if (response.body()!=null){
                    data.setValue(response.body());
                    Log.d(TAG, "onResponse: success");
                }
            }

            @Override
            public void onFailure(Call<ClubResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: failed");
            }
        });
        return data;
    }
}
