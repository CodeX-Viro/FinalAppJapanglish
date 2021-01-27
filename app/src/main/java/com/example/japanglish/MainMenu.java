package com.example.japanglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.charset.MalformedInputException;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Button JapToEng = (Button) findViewById(R.id.JapToEngBTN);
        Button EngToJap = (Button) findViewById(R.id.EngToJapBTN);
        Button Wikipedia = (Button) findViewById(R.id.WikipediaBTN);

        JapToEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, JapToEng.class));
            }
        });
        EngToJap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, EngToJap.class));
            }
        });
        Wikipedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, MiniWikipedia.class));
            }
        });

    }

    }
