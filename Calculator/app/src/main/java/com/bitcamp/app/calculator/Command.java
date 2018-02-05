package com.bitcamp.app.calculator;

import android.widget.EditText;
import org.w3c.dom.Text;

/**
 * Created by 1027 on 2018-02-05.
 */

public class Command {
    public static int makeInt (EditText inputno1, EditText inputno2, String s){
        int inputnoF = Integer.parseInt(String.valueOf(inputno1.getText()));
        int inputnoS = Integer.parseInt(String.valueOf(inputno2.getText()));

       // result = inputnoF +s+ inputnoS;
       // return result;
    }

}
