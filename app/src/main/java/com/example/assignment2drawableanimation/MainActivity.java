package com.example.assignment2drawableanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private controlviewmodel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model= new ViewModelProvider(this).get(controlviewmodel.class);
        model.init();
    }
}