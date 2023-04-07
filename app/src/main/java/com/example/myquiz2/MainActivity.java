package com.example.myquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 RadioButton answer1RadioButton, answer2RadioButton ,answer3RadioButton ,answer4RadioButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1RadioButton = findViewById(R.id.answer1RadioButton);
        answer2RadioButton = findViewById(R.id.answer2RadioButton);
        answer3RadioButton = findViewById(R.id.answer3RadioButton);
        answer4RadioButton = findViewById(R.id.answer4RadioButton);


        Button ShowButton;
        ShowButton = findViewById(R.id.ShowButton);
        Intent iNext;
        iNext = new Intent(MainActivity.this, MainActivity3.class);


        iNext.putExtra("Answer", "New Delhi");

        ShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);

            }

        });


        Button nextButton;
        nextButton = findViewById(R.id.nextButton);
        Intent iNextB;
        iNextB = new Intent(MainActivity.this, MainActivity2.class);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(iNextB);
            }
        });
        Button submitbutton;
        submitbutton = findViewById(R.id.submitbutton);
        Intent iNextb;
        iNextb = new Intent(MainActivity.this, MainActivity2.class);


        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(iNextb);
            }
        });


        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userAnswer = "";
                if (answer1RadioButton.isChecked()) {
                    userAnswer = answer1RadioButton.getText().toString();
                } else if (answer2RadioButton.isChecked()) {
                    userAnswer = answer2RadioButton.getText().toString();
                } else if (answer3RadioButton.isChecked()) {
                    userAnswer = answer3RadioButton.getText().toString();
                } else if (answer4RadioButton.isChecked()) {
                    userAnswer = answer4RadioButton.getText().toString();
                }

                String correctAnswer = "New Delhi"; // Replace this with the actual correct answer string
                if (userAnswer.equals(correctAnswer)) {
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                else if (userAnswer.equals("")){
                    Toast.makeText(MainActivity.this,"choose one" , Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong!show the answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    }
