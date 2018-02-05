package com.bitcamp.app.scheduler;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView today = findViewById(R.id.today_text);
        final CalendarView calendar = findViewById(R.id.calender_cal);
        final TimePicker clock = findViewById(R.id.clock_time);
        final TextView year = findViewById(R.id.year_text);
        final TextView month = findViewById(R.id.month_text);
        final TextView day = findViewById(R.id.day_text);
        final TextView hour = findViewById(R.id.hour_text);
        final TextView min = findViewById(R.id.min_text);
        today.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
        clock.setVisibility(View.INVISIBLE);
        findViewById(R.id.date_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              calendar.setVisibility(View.VISIBLE);
              clock.setVisibility(View.INVISIBLE);
            }
        });
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView View, int year, int month, int day) {
                 date = year +"-"+ (month+1)+"-"+day;
            }
        });
        findViewById(R.id.time_btm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 calendar.setVisibility(View.INVISIBLE);
                 clock.setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.reserve_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     String[] arr = date.split("-");
                     year.setText(arr[0]);
                     month.setText(arr[1]);
                     day.setText(arr[2]);
                     hour.setText(String.valueOf(clock.getHour()));
                     min.setText(String.valueOf(clock.getMinute()));
            }
        });
    }
}
