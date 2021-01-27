package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EasySchoolSupplies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easyschoolsupplies);

        Button next = (Button) findViewById(R.id.SchoolSuppliesNextBTN);
        Button back = (Button) findViewById(R.id.SchoolSuppliesBackBTN);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasySchoolSupplies.this, SchoolSupplies2.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasySchoolSupplies.this, EasyEngToJap.class));
            }
        });

    }
}
