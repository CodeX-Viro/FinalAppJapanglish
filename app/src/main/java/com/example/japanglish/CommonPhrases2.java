package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CommonPhrases2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normalcommonphrases2);

        Button gnext = (Button) findViewById(R.id.NewNewNextBTN);
        Button gback = (Button) findViewById(R.id.NCP2BackBTN);

        gnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommonPhrases2.this, Greetings.class));
            }
        });
        gback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommonPhrases2.this, CommonPhrases.class));
            }
        });

    }
}
