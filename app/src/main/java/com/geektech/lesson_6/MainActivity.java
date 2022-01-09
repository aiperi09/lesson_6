package com.geektech.lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame,new Fragment_1()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frame2,new Fragment_2()).commit();

    }
}