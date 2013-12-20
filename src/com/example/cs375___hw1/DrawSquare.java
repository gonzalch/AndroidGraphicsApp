package com.example.cs375___hw1;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/26/13
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawSquare extends View {
    Paint paint = new Paint();

    Integer xc1, yc1, xc2, yc2;
    float skewX, skewY;
    //boolean skew = false;
    /*
    public DrawSquare(Context context, Integer sSide) {
        super(context);
        side = sSide;
    }
     */
    public DrawSquare(Context context, Integer x1, Integer y1, Integer x2, Integer y2, float sX, float sY) {
        super(context);
        xc1 = x1;
        yc1 = y1;
        xc2 = x2;
        yc2 = y2;
        skewX = sX;
        skewY = sY;
    }



    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        //canvas.drawRect(xc1, yc1, xc2, yc2, paint);
        canvas.skew(skewX, skewY);
        canvas.drawRect(xc1, yc1, xc2, yc2, paint);

        /*
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawRect(153, 153, 147+side, 147+side, paint);
        */
    }

    /*
    @Override
     public void onDraw(Canvas canvas) {
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        canvas.drawRect(150, 150, 150+side, 150+side, paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawRect(153, 153, 147+side, 147+side, paint);

    }
     */
}
