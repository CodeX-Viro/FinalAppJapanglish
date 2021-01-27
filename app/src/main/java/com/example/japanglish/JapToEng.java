package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JapToEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japtoeng);

        Button easy = (Button) findViewById(R.id.EasyBTN);
        Button normal = (Button) findViewById(R.id.NormalBTN);
        Button difficult = (Button) findViewById(R.id.DifficultBTN);
        Button back = (Button) findViewById(R.id.JapToEngBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JapToEng.this, MainMenu.class));
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JapToEng.this, MainMenu.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JapToEng.this, MainMenu.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JapToEng.this, MainMenu.class));
            }
        });

    }
}
