package com.example.bhavproject.MVVMPattern;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class ClubViewModel extends AndroidViewModel {

    LiveData<ClubResponse> clubResponseLiveData;
    public ClubViewModel(@NonNull Application application) {
        super(application);
        clubResponseLiveData=ClubRepository.getClubList();
    }

    public LiveData<ClubResponse> getProjectListObservable() {
        return clubResponseLiveData;
    }
}
