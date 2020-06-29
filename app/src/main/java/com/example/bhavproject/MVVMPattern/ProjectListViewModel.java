package com.example.bhavproject.MVVMPattern;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ProjectListViewModel extends AndroidViewModel {

    private LiveData<CustomerTrackingResponse> projectListObservable ;

    public ProjectListViewModel(@NonNull Application application) {
        super(application);
        projectListObservable = ProjectRepository.getDataList();
    }
    public LiveData<CustomerTrackingResponse> getProjectListObservable() {
        return projectListObservable;
    }



}
