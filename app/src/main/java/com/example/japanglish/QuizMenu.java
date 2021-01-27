package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizmenu);

        Button easy = (Button) findViewById(R.id.EasyQuizModeBTN);
        Button normal = (Button) findViewById(R.id.NormalQuizModeBTN);
        Button difficult = (Button) findViewById(R.id.DifficultQuizModeBTN);
        Button back = (Button) findViewById(R.id.QuizMenuBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, EasyQuiz1.class));
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, NormalQuiz1.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, DifficultQuizMenu.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, MainMenu.class));
            }
        });

    }
}
