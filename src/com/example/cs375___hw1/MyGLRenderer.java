package com.example.cs375___hw1;

/**
 * Created with IntelliJ IDEA.
 * User: Chris
 * Date: 9/26/13
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.util.Log;
import android.opengl.Matrix;
import android.os.SystemClock;


public class MyGLRenderer implements GLSurfaceView.Renderer {
    private static final String TAG = "GLRenderer";
    private final Context context;
    private final MyCube cube = new MyCube();
    private long startTime;
    private long fpsStartTime;
    private long numFrames;
    public volatile float mAngle = 0;

    MyGLRenderer(Context context) {
        this.context = context;
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        //boolean SEE_THRU = true;
        boolean SEE_THRU = false;

        startTime = System.currentTimeMillis();
        fpsStartTime = startTime;
        numFrames = 0;
        // Define the lighting

        float lightAmbient[] = new float[] { 0.2f, 0.2f, 0.2f, 1 };
        float lightDiffuse[] = new float[] { 1, 1, 1, 1 };
        // Front lighting
        float[] lightPos = new float[] { 1, 1, 1, 1 };
        // Left side lighting
        //float[] lightPos = new float[] { -1.5f, 1.0f, -4.0f, 1.0f };
        // Right side lighting
        //float[] lightPos = new float[] { 1.5f, 1.0f, -4.0f, 1.0f };

        // If you want to reflect blue

        //float lightAmbient[] = new float[] { 0, 0, 1f, 1f };
        //float lightDiffuse[] = new float[] { 0, 0, 1f, 1f };
        //float[] lightPos = new float[] { 1f, 1f, 1f, 1.0f };

        gl.glEnable(GL10.GL_LIGHTING);
        gl.glEnable(GL10.GL_LIGHT0);
        gl.glLightfv(GL10.GL_LIGHT0, GL10.GL_AMBIENT, lightAmbient, 0);
        gl.glLightfv(GL10.GL_LIGHT0, GL10.GL_DIFFUSE, lightDiffuse, 0);
        gl.glLightfv(GL10.GL_LIGHT0, GL10.GL_POSITION, lightPos, 0);
        // What is the cube made of?
        float matAmbient[] = new float[] { 1, 1, 1, 1 };
        float matDiffuse[] = new float[] { 1, 1, 1, 1 };
        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_AMBIENT,
                matAmbient, 0);
        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_DIFFUSE,
                matDiffuse, 0);
        // Set up any OpenGL options we need
        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        if (SEE_THRU) {
            gl.glDisable(GL10.GL_DEPTH_TEST);
            gl.glEnable(GL10.GL_BLEND);
            gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE);
        }


        // Enable textures
        gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);
        gl.glEnable(GL10.GL_TEXTURE_2D);

        // Load the cube's texture from a bitmap
        MyCube.loadTexture(gl, context, R.drawable.texture);
    }

    public void onSurfaceChanged(GL10 gl, int width, int height)
    {

        // Define the view frustum
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        float ratio = (float) width / height;
        GLU.gluPerspective(gl, 45.0f, ratio, 1, 100f);

    }
    public void onDrawFrame(GL10 gl) {
        // Clear the screen to black
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT
                | GL10.GL_DEPTH_BUFFER_BIT);

        // Position model so we can see it
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();
        gl.glTranslatef(0, 0, -3.0f);

        // Set rotation angle based on the time
        long elapsed = System.currentTimeMillis() - startTime;
        if (mAngle != 0) {
            gl.glRotatef(mAngle, 0, 1, 0);
            gl.glRotatef(mAngle, 1, 0, 0);
        }

        else{
            gl.glRotatef(elapsed * (30f / 1000f), 0, 1, 0);
            gl.glRotatef(elapsed * (15f / 1000f), 1, 0, 0);
        }
        //gl.glRotatef(elapsed * (30f / 1000f), 0, 1, 0);
        //gl.glRotatef(elapsed * (15f / 1000f), 1, 0, 0);
        //gl.glRotatef(45, 0, 1, 0);
        // draw object
        //gl.glRotatef(0, 1, 0, 0);

        // Draw the model
        cube.draw(gl);

        // Keep track of number of frames drawn
        numFrames++;
        long fpsElapsed = System.currentTimeMillis() - fpsStartTime;
        if (fpsElapsed > 5 * 1000) { // every 5 seconds
            float fps = (numFrames * 1000.0F) / fpsElapsed;
            Log.d(TAG, "Frames per second: " + fps + " (" + numFrames
                    + " frames in " + fpsElapsed + " ms)");
            fpsStartTime = System.currentTimeMillis();
            numFrames = 0;
        }

    }
}
