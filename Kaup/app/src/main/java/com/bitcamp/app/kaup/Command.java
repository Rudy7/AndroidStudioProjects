package com.bitcamp.app.kaup;
import android.util.Log;
import android.widget.EditText;
/**
 * Created by 1027 on 2018-02-05.
 */
//    고도 비만 : 35 이상
//    중등도 비만 (2단계 비만) : 30 - 35
//    경도 비만 (1단계 비만) : 25 - 30
//    과체중 : 23 - 24.9
//    정상 : 18.5 - 22.9
//    저체중 : 18.5 미만
// BMI =weight/(tall*tall);
public class Command {
 public static String kaup(double weigh, double tal, String nam){

     double bmi = (double) weigh/(tal*tal/10000);
       String result = "";
     if(bmi>=35){
         result = nam +" 님은 고도 비만입니다. ";
     } else if(bmi>=30 && bmi<35){
         result = nam +" 님은 중등도 비만입니다.";
     } else if(bmi>=25 && bmi<30){
         result = nam +" 님은 경도 비만입니다.";
     } else if(bmi>=23 && bmi<25){
         result =  nam +" 님은 과체중 입니다.";
     } else if(bmi>=18.5 && bmi<23){
         result =  nam + " 님은 정상 입니다.";
     } else if(bmi<18.5){
         result =  nam +" 님은 저체중 입니다.";
     } return result+bmi;









}
    }
