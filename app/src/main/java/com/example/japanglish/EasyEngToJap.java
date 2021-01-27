package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EasyEngToJap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easyengtojap);

        Button easy = (Button) findViewById(R.id.SchoolSuppliesBTN2);
        Button normal = (Button) findViewById(R.id.NumberBTN2);
        Button difficult = (Button) findViewById(R.id.FoodsBTN2);
        Button back = (Button) findViewById(R.id.EasyEngToJapBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyEngToJap.this, EasySchoolSupplies.class));
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyEngToJap.this, EasyNumbers.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyEngToJap.this, EasyFoods.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyEngToJap.this, EngToJap.class));
            }
        });

    }
}
