package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sentences3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sentences3);

        Button s3next = (Button) findViewById(R.id.Sentences3NextBTN);
        Button s3back = (Button) findViewById(R.id.Sentences3BackBTN);

        s3next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences3.this, Sentences4.class));
            }
        });
        s3back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sentences3.this, Sentences2.class));
            }
        });

    }
}
