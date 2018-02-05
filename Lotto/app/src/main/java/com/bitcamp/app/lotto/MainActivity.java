package com.bitcamp.app.lotto;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final TextView result = findViewById(R.id.cre_num_result);
        findViewById(R.id.cre_num_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = "";
                int[] arr = new int[6];
                for (int i = 0; i < 6; i++) {
                    arr[i] = ((int) (Math.random() * 45 + 1));
                        for (int j = 0; j < i; j++) {
                            if (arr[i] == arr[j]) {
                                i--;
                            }
                        }
                }
                for (int i = 0; i < 6; i++) {
                    if (i == 5) {
                        num += arr[i];
                    } else {
                        num += arr[i] + ",";
                    }
                    result.setText(num);
                }
            }
        });
    }
}

