package com.example.japanglish;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizMenu extends AppCompatActivity {
    private static final int REQUEST_CODE_QUIZ = 1;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGHSCORE = "keyHighScore";

    private TextView textViewHighscore;

    private int highscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizmenu);

        textViewHighscore = findViewById(R.id.all_time_high);
        loadHighScore();

        Button easy = (Button) findViewById(R.id.EasyQuizModeBTN);
        Button normal = (Button) findViewById(R.id.NormalQuizModeBTN);
        Button difficult = (Button) findViewById(R.id.DifficultQuizModeBTN);
        Button back = (Button) findViewById(R.id.QuizMenuBackBTN);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, NormalQuiz1.class));
            }
        });
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, DifficultQuizMenu.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizMenu.this, MainMenu.class));
            }
        });

    }
    private void startQuiz(){
        Intent intent = new Intent(QuizMenu.this, EasyQuiz1.class);
        startActivityForResult(intent, REQUEST_CODE_QUIZ);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_QUIZ){
            if (resultCode == RESULT_OK){
                int score = data.getIntExtra(EasyQuiz1.EXTRA_SCORE, 0);
                if (score > highscore){
                    updateHighscore(score);
                }

            }
        }
    }

    private void loadHighScore (){
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        highscore = prefs.getInt(KEY_HIGHSCORE, 0);
        textViewHighscore.setText("Highscore: " + highscore);
    }
    private void updateHighscore(int highscoreNew){
        highscore = highscoreNew;
        textViewHighscore.setText("Highscore: " + highscore);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGHSCORE, highscore);
        editor.apply();

    }

}

