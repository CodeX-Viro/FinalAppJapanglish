package com.example.japanglish;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.example.japanglish.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "QuizDatabase.db";
    private static final int DATABASE_VERSION = 4;

    private SQLiteDatabase db;



    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
       onCreate(db);
    }

    private void fillQuestionsTable(){
        Question q1 = new Question("What is the Japanese translation of Apple? \n" +
                "\n" +
                "質問 :  Appleの日本語訳は何ですか？", "A. Ringo 林檎", "B. Orenjii オレンジ", "C. Ichigo イチゴ", 1 );
        addQuestion(q1);
        Question q2 = new Question("What is the Japanese translation of Orange?\n" +
                "\n" +
                "質問 :  Orangeの日本語訳は何ですか？", "A. Ichigo イチゴ", "B. Ringo 林檎", "C. Orenjii オレンジ", 3 );
        addQuestion(q2);
        Question q3 = new Question("What is the Japanese translation of Strawberry?\n" +
                "\n" +
                "質問 :  Strawberryの日本語訳は何ですか？\n", "A. Suika スイカ", "B. Ichigo イチゴ", "C. Ringo 林檎", 2 );
        addQuestion(q3);
        Question q4 = new Question("What is the Japanese translation of Avocado?\n" +
                "\n" +
                "質問 :  Avocadoの日本語訳は何ですか？", "A. Abokado アボカド", "B. Cherii チェリー", "C. Budo ブドウ", 1 );
        addQuestion(q4);
        Question q5 = new Question("What is the Japanese translation of Cherry?\n" +
                "\n" +
                "質問 :  Cheriiの日本語訳は何ですか？", "A. Budo ブドウ", "B. Sakuranbo さくらんぼ", "C. Zakuro ザクロ", 2 );
        addQuestion(q5);
        Question q6 = new Question("What is the Japanese translation of Grapes?\n" +
                "\n" +
                "質問 :  Grapesの日本語訳は何ですか？", "A. Suika スイカ", "B. Budo ブドウ", "C. Abokado アボカド", 2 );
        addQuestion(q6);
        Question q7 = new Question("What is the Japanese translation of Pumpkin?\n" +
                "\n" +
                "質問 :  Pumpkinの日本語訳は何ですか？", "A. Ringo 林檎", "B. Kabocha かぼちゃ", "C. Ichigo イチゴ", 2 );
        addQuestion(q7);
        Question q8 = new Question("What is the Japanese translation of Peach?\n" +
                "\n" +
                "質問 :  Peachの日本語訳は何ですか？", "A. Abokado アボカド", "B. Budo ブドウ", "C. Momo 桃", 3 );
        addQuestion(q8);
        Question q9 = new Question("What is the Japanese translation of Pear?\n" +
                "\n" +
                "質問 :  Pearの日本語訳は何ですか？", "A. Nashi 梨", "B. Kabocha かぼちゃ", "C. Zakuro ザクロ", 1 );
        addQuestion(q9);
        Question q10 = new Question("What is the Japanese translation of Watermelon?\n" +
                "\n" +
                "質問 :  Watermelonの日本語訳は何ですか？", "A. Suika スイカ", "B. Orenjii オレンジ", "C. Budo ブドウ", 1 );
        addQuestion(q10);
        Question q11 = new Question("What is the Japanese translation of Onion?\n" +
                "\n" +
                "質問 :  Onionの日本語訳は何ですか？", "A. Tamanegi 玉ねぎ", "B. Tamago 卵", "C. Gyuniku 牛肉", 1 );
        addQuestion(q11);
        Question q12 = new Question("What is the Japanese translation of Eggplant?\n" +
                "\n" +
                "質問 :  Eggplantの日本語訳は何ですか？", "A. Buta 豚", "B. Nasu ナス", "C. Tori 鳥", 2 );
        addQuestion(q12);
        Question q13 = new Question("What is the Japanese translation of Carrot?\n" +
                "\n" +
                "質問 :  Carrotの日本語訳は何ですか？", "A. Jagaimo じゃがいも", "B. Retasu レタス", "C. Ninjin にんじん", 3 );
        addQuestion(q13);
        Question q14 = new Question("What is the Japanese translation of Potato?\n" +
                "\n" +
                "質問 :  Potatoの日本語訳は何ですか？", "A. Nasu ナス", "B. Jagaimo じゃがいも", "C. Tamanegi 玉ねぎ", 2 );
        addQuestion(q14);
        Question q15 = new Question("What is the Japanese translation of Lettuce?\n" +
                "\n" +
                "質問 :  Lettuceの日本語訳は何ですか？", "A. Retasu レタス", "B. Ninjin にんじん", "C. Tamago 卵", 1 );
        addQuestion(q15);
        Question q16 = new Question("What is the Japanese translation of Chicken?\n" +
                "\n" +
                "質問 :  Chickenの日本語訳は何ですか？", "A. Gyuniku 牛肉", "B. Tori 鳥", "C. Jagaimo じゃがいも", 2 );
        addQuestion(q16);
        Question q17 = new Question("What is the Japanese translation of Pig?\n" +
                "\n" +
                "質問 :  Pigの日本語訳は何ですか？", "A. Retasu レタス", "B. Tamanegi 玉ねぎ", "C. Buta 豚", 3 );
        addQuestion(q17);
        Question q18 = new Question("What is the Japanese translation of Cow?\n" +
                "\n" +
                "質問 :  Cowの日本語訳は何ですか？", "A. Ninjin にんじん", "B. Gyuniku 牛肉", "C. Nasu ナス", 2 );
        addQuestion(q18);
        Question q19 = new Question("What is the Japanese translation of Eggs?\n" +
                "\n" +
                "質問 :  Eggの日本語訳は何ですか？", "A. Tamago 卵", "B. Jagaimo じゃがいも", "C. Tori 鳥", 1 );
        addQuestion(q19);
        Question q20 = new Question("What is the Japanese translation of Scissors?\n" +
                "\n" +
                "質問 :  Scissorsの日本語訳は何ですか？", "A. Hasami はさみ", "B. Orenjii オレンジ", "C. Budo ブドウ", 1 );
        addQuestion(q20);
    }
    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }
    public List<Question> getAllQuestions(){
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);

            }while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
