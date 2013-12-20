package com.example.cs375___hw1;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/29/13
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawRect extends View {
    Paint paint = new Paint();
    String colorText;


    public DrawRect(Context context, String rColor) {
        super(context);

        colorText = rColor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.parseColor(colorText));
        paint.setStrokeWidth(3);
        canvas.drawRect(100, 150, 400, 350, paint);
        /*
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawRect(153, 153, 347, 347, paint);
        */
    }

}