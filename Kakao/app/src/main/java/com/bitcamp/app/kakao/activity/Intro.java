package com.bitcamp.app.kakao.activity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bitcamp.app.kakao.R;

import java.lang.reflect.Member;

public class Intro extends AppCompatActivity {
    SQLiteHelper helper;
    static final String DATABASE_NAME = "kakao.db";
    static final String TABLE_MEMBER = "member";
    static final String MEMBER_1 = "id";
    static final String MEMBER_2 = "pass";
    static final String MEMBER_3 = "name";
    static final String MEMBER_4 = "email";
    static final String MEMBER_5 = "phone_number";
    static final String MEMBER_6 = "profile_photo";
    static final String MEMBER_7 = "address";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        final Context context = Intro.this;
        final EditText phoneNumber = findViewById(R.id.phone_number);
        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, "인증 전화번호" +String.valueOf(phoneNumber.getText()), Toast.LENGTH_LONG).show();
               helper = new SQLiteHelper(context);
               startActivity(new Intent(context,Index.class));  //from d, to d 이다
           }
       });
    }
       static  class  Member{
           int id, pass,name,email,phoneNumber,profilePhoto,address;
       }
       static interface  LoginService{public void execute();}
       static  abstract class QueryFactory{
           Context context;
           public QueryFactory(Context context) { //ALT + INSERT 생성자 바로 만들기
               this.context = context;
           }
           public abstract SQLiteDatabase getDatabase();
       }
       static class  SQLiteHelper extends SQLiteOpenHelper {
            public SQLiteHelper(Context context) {
                super(context, DATABASE_NAME, null, 1);
                this.getWritableDatabase();
            }
            @Override
            public void onCreate(SQLiteDatabase db) {
                db.execSQL(
                        String.format("CREATE TABLE IF NOT EXISTS %s(" +
                                      " %s INTEGER PRIMARY KEY AUTOINCREMENT," +
                                      " %s TEXT," +
                                      " %s TEXT," +
                                      " %s TEXT," +
                                      " %s TEXT," +
                                      " %s TEXT," +
                                      " %s TEXT);",
                                       TABLE_MEMBER,MEMBER_1,MEMBER_2,
                                            MEMBER_3,MEMBER_4,MEMBER_5,
                                            MEMBER_6,MEMBER_7));
                        for(int i=1; i<6; i++){
                            db.execSQL(
                                    String.format(" INSERT INTO %s ("+
                                                    "%s, %s, %s, %s, %s, %s)"+
                                                    " VALUES ('%s','%s','%s','%s','%s','%s');",
                                            TABLE_MEMBER,
                                            MEMBER_2, MEMBER_3,
                                            MEMBER_4,MEMBER_5,
                                            MEMBER_6,MEMBER_7,
                                            "1", "홍길동"+i,
                                            "hong"+i+"@gmail.com", "010-1234-567"+i,
                                            "default_profile","서울 백범로 "+i+"길"));
                        }
            }
            @Override
            public void onUpgrade(SQLiteDatabase db, int i, int i1) {
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
                onCreate(db);
            }
        }
}

