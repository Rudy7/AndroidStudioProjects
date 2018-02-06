package com.bitcamp.app.kakao.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bitcamp.app.kakao.R;

public class MemberList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_list);
        final Context context = MemberList.this;
        findViewById(R.id.friend_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"친구프로필 보기",Toast.LENGTH_LONG).show();
                startActivity(new Intent(context,MemberDetail.class));
            }
        });
        findViewById(R.id.logout_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "로그아웃",Toast.LENGTH_LONG).show();
                startActivity(new Intent(context,Index.class));
            }
        });
    }
}
