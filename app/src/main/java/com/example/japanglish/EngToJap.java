package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EngToJap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engtojap);

        Button easy = (Button) findViewById(R.id.EasyBTN2);
        Button normal = (Button) findViewById(R.id.NormalBTN2);
        Button difficult = (Button) findViewById(R.id.DifficultBTN2);
        Button back = (Button) findViewById(R.id.EngToJapBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EngToJap.this, EasyEngToJap.class));
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EngToJap.this, NormalEngToJap.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EngToJap.this, DifficultEngToJap.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EngToJap.this, MainMenu.class));
            }
        });

    }
}
