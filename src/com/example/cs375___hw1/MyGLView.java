package com.example.cs375___hw1;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 9/26/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class MyGLView extends GLSurfaceView {
    float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private final MyGLRenderer renderer;
    MyGLView(Context context) {
        super(context);
        renderer = new MyGLRenderer(context);
        setRenderer(renderer);

        // Render the view only when there is a change
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    float mPreviousX = 0;
    float mPreviousY = 0;

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();



        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE:


                float dx = x - mPreviousX;
                float dy = y - mPreviousY;

                // reverse direction of rotation above the mid-line
                if (y > getHeight() / 2) {
                    dx = dx * -1 ;
                }

                // reverse direction of rotation to left of the mid-line
                if (x < getWidth() / 2) {
                    dy = dy * -1 ;
                }

                renderer.mAngle += (dx + dy) * TOUCH_SCALE_FACTOR;  // = 180.0f / 320
                requestRender();
        }

        mPreviousX = x;
        mPreviousY = y;
        return true;
    }

}
