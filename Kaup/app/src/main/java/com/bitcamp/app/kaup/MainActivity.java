package com.bitcamp.app.kaup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final EditText name = findViewById(R.id.name_input);
        final EditText weight = findViewById(R.id.weight_input);
        final EditText tall = findViewById(R.id.tall_input);
        final TextView result = findViewById(R.id.result_text);
        findViewById(R.id.cal_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam = String.valueOf(name.getText());
                double weigh = Double.parseDouble(String.valueOf(weight.getText()));
                double tal = Double.parseDouble(String.valueOf(tall.getText()));
                result.setText(Command.kaup(weigh, tal, nam));

            }
        });


    }
}
