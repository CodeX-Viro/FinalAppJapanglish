package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sentences4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sentences4);

        Button s4next = (Button) findViewById(R.id.Sentences4NextBTN);
        Button s4back = (Button) findViewById(R.id.Sentences4BackBTN);

        s4next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences4.this, EasyQuizMenu.class));
            }
        });
        s4back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences4.this, Sentences3.class));
            }
        });

    }
}
