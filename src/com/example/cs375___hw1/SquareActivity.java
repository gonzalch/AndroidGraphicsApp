package com.example.cs375___hw1;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 8/26/13
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SquareActivity extends Activity {
    Boolean firstTouch = false;
    Boolean scale = false;
    Boolean rotate = false;
    Boolean shear = false;
    Boolean fold = false;
    int foldV = 0;
    int foldH = 0;
    int clipCount = 0;
    int x1, y1, x2, y2, side, sX1, sY1, sX2, sY2;
    float rot = 1;
    float skew = 0.1f;
    DrawSquare drawSquare;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        Bundle b = getIntent().getExtras();
        side = b.getInt("key");

        super.onCreate(savedInstanceState);

        x1 = 150;
        y1 = 150;
        DrawSquare drawSquare = new DrawSquare(this, x1, y1, x1+side, y1+side, 0f, 0f);

        sX1 = drawSquare.xc1;
        sY1 = drawSquare.yc1;
        sX2 = drawSquare.xc2;
        sY2 = drawSquare.yc2;
        //drawSquare.setBackgroundColor(Color.WHITE);

        //Button scaleButton = new Button(this);
        //do stuff like add text and listeners.

        //drawSquare.addView(scaleButton);

        //FrameLayout sLayout = (FrameLayout)findViewById(R.id.squareLayout);
        //sLayout.addView(drawSquare);
        setContentView(drawSquare);
        //Toast.makeText(this, String.valueOf(side), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, side, Toast.LENGTH_SHORT).show();


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        sX1 = drawSquare.xc1;
        sY1 = drawSquare.yc1;
        sX2 = drawSquare.xc2;
        sY2 = drawSquare.yc2;



        switch (keyCode) {
            case KeyEvent.KEYCODE_S:
            {
                Toast.makeText(this, "scale clicked", Toast.LENGTH_SHORT).show();
                scale = true;
                rotate = false;
                shear = false;
                fold = false;
                return true;
            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_R:
            {
                Toast.makeText(this, "rotate clicked", Toast.LENGTH_SHORT).show();
                scale = false;
                rotate = true;
                shear = false;
                fold = false;
                return true;
            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_H:
            {
                Toast.makeText(this, "shear clicked", Toast.LENGTH_SHORT).show();
                scale = false;
                rotate = false;
                shear = true;
                fold = false;
                return true;
            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_F:
            {
                Toast.makeText(this, "fold clicked", Toast.LENGTH_SHORT).show();
                scale = false;
                rotate = false;
                shear = false;
                fold = true;
                return true;
            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
            {
                //Toast.makeText(this, "scale clicked", Toast.LENGTH_SHORT).show();
                if (scale) {

                    drawSquare = new DrawSquare(this, sX1 - 2, sY1 - 2, sX2 + 2, sY2 + 2, 0f, 0f);
                    setContentView(drawSquare);
                }
                if (rotate) {

                    drawSquare.setPivotX(sX1 + (sX2-sX1)/2);
                    drawSquare.setPivotY(sY1 + (sY2 - sY1) / 2);
                    drawSquare.setRotation(rot);
                    setContentView(drawSquare);
                    rot += 3;
                }

                if (shear) {

                    drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2, skew, 0f);
                    setContentView(drawSquare);
                    skew += skew;
                }
                if (fold) {
                    if ((sY2 - sY1) > 1){

                        drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2 - (sY2 -sY1)/2, 0f, 0f);
                        setContentView(drawSquare);
                        foldV++;
                    }
                   /* else if ((sY2 - sY1) > 1){
                        drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2 - (sY2 - sY1 + 1)/2, 0F, 0f);
                        setContentView(drawSquare);
                        foldV++;
                    }*/
                }
                return true;
            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_DOWN:
            {
                //Toast.makeText(this, "scale clicked", Toast.LENGTH_SHORT).show();
                if (scale) {


                    drawSquare = new DrawSquare(this, sX1 + 2, sY1 + 2, sX2 - 2, sY2 - 2, 0f, 0f);
                    setContentView(drawSquare);
                }

                if (rotate) {

                    drawSquare.setPivotX(sX1 + (sX2-sX1)/2);
                    drawSquare.setPivotY(sY1 + (sY2-sY1)/2);
                    drawSquare.setRotation(-rot);
                    setContentView(drawSquare);
                    rot += 3;
                }

                if (shear) {

                    drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2, 0f, skew);
                    setContentView(drawSquare);
                    skew += skew;
                }

                if (fold) {
                    if (foldV > 0) {
/*

                        if (clipCount > 0){
                            drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2  + (sY2 - sY1) + 1, 0f, 0f);
                            setContentView(drawSquare);
                            clipCount--;
                            foldV--;
                        }

                        else {
                            drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2  + (sY2 - sY1), 0f, 0f);
                            setContentView(drawSquare);
                            foldV--;
                        }
*/
                        drawSquare = new DrawSquare(this, sX1, sY1, sX2, sY2  + (sY2 - sY1), 0f, 0f);
                        setContentView(drawSquare);
                        foldV--;

                    }
                }

                return true;
            }
        }


        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_RIGHT:
            {

                if (fold) {
                    if ((sX2 - sX1) > 1){

                        drawSquare = new DrawSquare(this, sX1, sY1, sX2  - (sX2 -sX1)/2, sY2, 0f, 0f);
                        setContentView(drawSquare);
                        foldH++;
                    }

                }
                return true;

            }
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_LEFT:
            {

                if (fold) {
                    if (foldH > 0) {

                        drawSquare = new DrawSquare(this, sX1, sY1, sX2   + (sX2 - sX1), sY2, 0f, 0f);
                        setContentView(drawSquare);
                        foldH--;

                    }
                }
                return true;

            }
        }

        return super.onKeyDown(keyCode, event);
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {

        x2 = (int) event.getX();
        y2 = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
        }
/*
        if (scale) {
            drawSquare = new DrawSquare(this, x1, y1, x2, y2);
            setContentView(drawSquare);
            x1 = x2;
            y1 = y2;
        }
        */

        drawSquare = new DrawSquare(this, x2 - (sX2 -sX1)/2, y2 - (sY2 - sY1)/2, x2 + (sX2 -sX1)/2, y2 + (sY2 -sY1)/2, 0f, 0f);
        setContentView(drawSquare);

        /*
        if (!firstTouch) {
            x1 = (int) event.getX();
            y1 = (int) event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_UP:
            }
            firstTouch = true;
        }

        if (firstTouch) {
            x2 = (int) event.getX();
            y2 = (int) event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_UP:
            }

            drawSquare = new DrawSquare(this, x1, y1, x2, y2);
            setContentView(drawSquare);

            firstTouch = false;
        }
        */
        //Toast.makeText(this, String.valueOf(x) + ", " + String.valueOf(y), Toast.LENGTH_SHORT).show();

        sX1 = drawSquare.xc1;
        sY1 = drawSquare.yc1;
        sX2 = drawSquare.xc2;
        sY2 = drawSquare.yc2;

        return false;
    }
}