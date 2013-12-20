package com.example.cs375___hw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.lang.Math;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/27/13
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class DrawCrinkly extends View {


    Paint paint = new Paint();
    int n = 6;
    double r = 400/(Math.pow( 2 , n));
    float x1, x2, y1, y2 = 0;

    public DrawCrinkly(Context context) {
        super(context);
        paint.setColor(Color.WHITE);
    }

    @Override
    public void onDraw(Canvas canvas) {

        hilbert(r, 0, canvas);

        //canvas.translate(100, 100);
    }

    // Hilbert curve
    private void hilbert(double r1, double r2, Canvas hCanvas) {
        n--;

        if(n>0) hilbert(r2, r1, hCanvas);
        x2 += r1;
        y2 += r2;
        hCanvas.drawLine(x1, y1, x2, y2, paint);
        x1 = x2;
        y1 = y2;

        if(n>0) hilbert(r1, r2, hCanvas);
        x2 += r2;
        y2 += r1;
        hCanvas.drawLine(x1, y1, x2, y2, paint);
        x1 = x2;
        y1 = y2;

        if(n>0) hilbert(r1, r2, hCanvas);
        x2 -= r1;
        y2 -= r2;
        hCanvas.drawLine(x1, y1, x2, y2, paint);
        x1 = x2;
        y1 = y2;

        if(n>0) hilbert(-r2, -r1, hCanvas);
        n++;

    }

}
