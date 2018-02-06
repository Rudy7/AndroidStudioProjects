package com.bitcamp.app.kakao.activity;

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

        findViewById(R.id.logout_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   Toast.makeText(context,Toast.LENGTH_LONG).show();
                Toast.makeText(context,"아이디"+ String.valueOf(.getText()),Toast.LENGTH_LONG).show();*/
//                Intent intent = new Intent(context, MemberDetail.class);
//                startActivity(intent);

            }
        });
    }
}
