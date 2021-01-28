package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sentences2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sentences2);

        Button s2next = (Button) findViewById(R.id.Sentences2NextBTN);
        Button s2back = (Button) findViewById(R.id.Sentences2BackBTN);

        s2next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences2.this, Sentences3.class));
            }
        });
        s2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences2.this, Sentences.class));
            }
        });

    }
}
