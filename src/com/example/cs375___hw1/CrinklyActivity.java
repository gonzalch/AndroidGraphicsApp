package com.example.cs375___hw1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/27/13
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class CrinklyActivity extends Activity {

    DrawCrinkly drawCrinkly;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drawCrinkly = new DrawCrinkly(this);
        setContentView(drawCrinkly);
    }

}