package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Commonphrases3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normalcommonphrases3);

        Button bnext = (Button) findViewById(R.id.NCP3NextBTN);
        Button bback = (Button) findViewById(R.id.NCP3BackBTN);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Commonphrases3Activity.this, Greetings.class));
            }
        });
        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Commonphrases3Activity.this, CommonPhrases.class));
            }
        });

    }
}
