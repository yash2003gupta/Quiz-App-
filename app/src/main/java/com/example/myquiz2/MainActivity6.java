package com.example.myquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent fromAct = getIntent();
        String Title = fromAct.getStringExtra("title");
        String Answer = fromAct.getStringExtra("Answer");


        TextView txtStudentInfo;

        txtStudentInfo = findViewById(R.id.txtStudentInfo);
        txtStudentInfo.setText("Answer: "+Answer);

        getSupportActionBar().setTitle(Title);

    }
}