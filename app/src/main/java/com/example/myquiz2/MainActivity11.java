package com.example.myquiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {
    RadioButton answer1RadioButton, answer2RadioButton ,answer3RadioButton ,answer4RadioButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        answer1RadioButton = findViewById(R.id.answer1RadioButton);
        answer2RadioButton = findViewById(R.id.answer2RadioButton);
        answer3RadioButton = findViewById(R.id.answer3RadioButton);
        answer4RadioButton = findViewById(R.id.answer4RadioButton);


        Button ShowButton;
        ShowButton = findViewById(R.id.ShowButton);
        Intent iNext;
        iNext = new Intent(MainActivity11.this, MainActivity12.class);


        iNext.putExtra("Answer", "Cairo");

        ShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);

            }

        });


        Button nextButton;
        nextButton = findViewById(R.id.nextButton);
        Intent iNextB;
        iNextB = new Intent(MainActivity11.this, MainActivity13.class);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(iNextB);
            }
        });

        Button submitbutton;
        submitbutton = findViewById(R.id.submitbutton);
        Intent iNextb;
        iNextb = new Intent(MainActivity11.this, MainActivity13.class);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(iNextb);
            }
        });
        Button previous;
        previous= findViewById(R.id.previous);
        Intent iNextp;
        iNextp = new Intent(MainActivity11.this, MainActivity9.class);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(iNextp);
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
                String correctAnswer = "Cairo"; // Replace this with the actual correct answer string
                if (userAnswer.equals(correctAnswer)) {

                    Toast.makeText(MainActivity11.this, "Correct!", Toast.LENGTH_SHORT).show();
                }

                else if (userAnswer.equals("")){
                    Toast.makeText(MainActivity11.this,"choose one" , Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity11.this, "Wrong!show the Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}