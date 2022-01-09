package com.geektech.lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        textView = findViewById(R.id.name_of_song);
        String text = getIntent().getStringExtra("key");
        textView.setText(text);
    }
}