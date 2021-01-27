package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NormalEngToJap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normalengtojap);

        Button easy = (Button) findViewById(R.id.CommonPhrasesBTN);
        Button normal = (Button) findViewById(R.id.GreetingsBTN2);
        Button difficult = (Button) findViewById(R.id.AdvancedWordsBTN2);
        Button back = (Button) findViewById(R.id.NormalEngToJapBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalEngToJap.this, CommonPhrases.class));
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalEngToJap.this, Greetings.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalEngToJap.this, AdvancedWords.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalEngToJap.this, EngToJap.class));
            }
        });

    }
}
