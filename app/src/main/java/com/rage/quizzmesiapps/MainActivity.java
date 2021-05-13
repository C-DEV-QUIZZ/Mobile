package com.rage.quizzmesiapps;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.TextView;

import static android.os.Build.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // cache la action bar
        getSupportActionBar().hide();
        TextView version =   findViewById(R.id.txtVersion);
        version.setText(BuildConfig.VERSION_NAME);
    }



}