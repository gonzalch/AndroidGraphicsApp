package com.example.cs375___hw1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 9/26/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class CubeActivity extends Activity {

    MyGLView myGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myGLView = new MyGLView(this);
        setContentView(myGLView);
    }
}