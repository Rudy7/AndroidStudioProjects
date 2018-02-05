package com.bitcamp.app.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Comment;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final EditText inputno1 = findViewById(R.id.input_no1);
        final EditText inputno2 = findViewById(R.id.input_no2);
        final Button plusbtn = findViewById(R.id.plus_btn);
        final Button minusbtn = findViewById(R.id.minus_btn);
        final Button multiplbtn = findViewById(R.id.multipl_btn);
        final Button divisionbtn = findViewById(R.id.division_btn);
        final TextView result = findViewById(R.id.result);
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              result.setText(Command.makeInt(inputno1,inputno2, "+"));
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(String.valueOf(inputno1.getText()));
                int no2 = Integer.parseInt(String.valueOf(inputno2.getText()));
               // Toast.makeText(context."", ).show();
            }
        });
        multiplbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(String.valueOf(inputno1.getText()));
                int no2 = Integer.parseInt(String.valueOf(inputno2.getText()));
            }
        });
        divisionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(String.valueOf(inputno1.getText()));
                int no2 = Integer.parseInt(String.valueOf(inputno2.getText()));
            }
        });


    }
}
