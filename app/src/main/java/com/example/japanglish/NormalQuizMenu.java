package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NormalQuizMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normalquizmenu);

        Button next = (Button) findViewById(R.id.NormalQuizAcceptBTN);
        Button back = (Button) findViewById(R.id.NormalQuizDenyBTN);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalQuizMenu.this, QuizMenu.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalQuizMenu.this, MainMenu.class));
            }
        });

    }
}
