package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sentences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sentences1);

        Button s1next = (Button) findViewById(R.id.Sentences1NextBTN);
        Button s1back = (Button) findViewById(R.id.Sentences1BackBTN);

        s1next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences.this, Sentences2.class));
            }
        });
        s1back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences.this, EngToJap.class));
            }
        });

    }
}
