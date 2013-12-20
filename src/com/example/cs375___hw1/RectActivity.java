package com.example.cs375___hw1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/29/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class RectActivity extends Activity {

    DrawRect drawRect;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle b = getIntent().getExtras();
        String color = b.getString("key");

        drawRect = new DrawRect(this, color);
        //drawSquare.setBackgroundColor(Color.WHITE);
        setContentView(drawRect);
    }
}