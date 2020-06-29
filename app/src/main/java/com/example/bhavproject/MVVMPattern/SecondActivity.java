package com.example.bhavproject.MVVMPattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bhavproject.R;

public class SecondActivity extends AppCompatActivity {


    ClubViewModel clubViewModel;
    private static final String TAG = "MVVMPatternActivity";
    String club_id="1";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.text);
        clubViewModel= ViewModelProviders.of(this).get(ClubViewModel.class);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}