package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Greetings2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetings2);

        Button greetings2next = (Button) findViewById(R.id.Greetings2NextBTN);
        Button greetings2back = (Button) findViewById(R.id.Greetings2BackBTN);

        greetings2next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greetings2.this, AdvancedWords.class));
            }
        });
        greetings2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greetings2.this, Greetings.class));
            }
        });

    }
}
