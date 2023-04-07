package com.example.myquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Intent fromAct = getIntent();
        String Title = fromAct.getStringExtra("title");
        String Answer = fromAct.getStringExtra("Answer");


        TextView txtStudentInfo;

        txtStudentInfo = findViewById(R.id.txtStudentInfo);
        txtStudentInfo.setText("Answer: "+Answer);

        getSupportActionBar().setTitle(Title);

    }
}