package com.example.bhavproject.MVVMPattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.bhavproject.R;

import java.util.List;

public class MVVMPatternActivity extends AppCompatActivity {


    ProjectListViewModel projectListViewModel;
    private static final String TAG = "MVVMPatternActivity";
    RecyclerView recyclerView;
    CustomerTrackingResponse customerTrackingResponse;
    MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        projectListViewModel = ViewModelProviders.of(this).get(ProjectListViewModel.class);
        projectListViewModel.getProjectListObservable().observe(this, new Observer<CustomerTrackingResponse>() {
            @Override
            public void onChanged(CustomerTrackingResponse customerTrackingResponse) {
                if (customerTrackingResponse!=null){
                    Log.d(TAG, "onChanged: "+customerTrackingResponse);
                    moviesAdapter=new MoviesAdapter(customerTrackingResponse);
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(moviesAdapter);

                }
            }
        });




    }
}
