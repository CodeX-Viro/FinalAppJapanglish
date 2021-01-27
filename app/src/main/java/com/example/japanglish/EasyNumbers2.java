package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EasyNumbers2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easynumbers2);

        Button next = (Button) findViewById(R.id.Numbers2NextBTN);
        Button back = (Button) findViewById(R.id.Numbers2BackBTN);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyNumbers2.this, EasyFoods.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyNumbers2.this, EasyNumbers.class));
            }
        });

    }
}
