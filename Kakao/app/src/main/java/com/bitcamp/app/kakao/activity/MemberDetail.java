package com.bitcamp.app.kakao.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bitcamp.app.kakao.R;

public class MemberDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_detail);
        final Context context = MemberDetail.this;
        findViewById(R.id.update_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"수정",Toast.LENGTH_LONG).show();
                startActivity(new Intent(context,MemberList.class));
            }
        });
    }
}
