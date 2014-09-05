AndroidGraphicsApp
==================

Android app showcasing various Canvas and OpenGL properties


For my project I decided to program an Android application to demonstrate what I have learned in computer graphics. This was done using the Java programming language and various libraries such as Android Canvas and OpenGL. 

The first part of the project that I created was simply drawing a white square on a canvas and displaying it to the screen. It allows you to input the length of the sides (in pixels) which it takes as an argument and uses to draw the square by calling canvas.drawRect(x1, y1, x2, y2, paintColor). It was very simple to implement due to the built in drawRect function. The same drawRect function was also used for the second part of the project, which allows you to enter a color and will draw a fixed rectangle of the specified color on the canvas and display it to the screen.

The third part of the project I implemented the Hilbert space-filling curve algorithm. I used the recursive algorithm provided by you in class and created a hilbert function that draws a line to the canvas in between each change to x and y (the point the curve is currently at). After the new point (x2, y2) is set it draws a line between the old point (x1, y1) and the new one.

        x2 += r1;
        y2 += r2;
        hCanvas.drawLine(x1, y1, x2, y2, paint);
        x1 = x2;
        y1 = y2;

	The fourth part is an animated view that loads a tennis ball bitmap from resources and creates a BitmapDrawable that allows the ball to move about the screen and bounce off the boundaries. The code for the bouncing algorithm was found online.
	
The fifth part is my personal favorite and also the one I have put the most time into. When you click “Draw Cube” a textured 3D cube is rendered with OpenGL and displayed to the screen. It responds to user touch input and rotates on an axis when touched. I do not have the rotation working exactly how I want to yet (I would like it to move with the users finger). To implement this part of the project I needed three classes, MyCube, MyGLRenderer, and MyGLView. MyCube is responsible for defining the vertices of the cube as well as laying the bitmap texture over the faces of the cube. MyGLRenderer is where most of the work happens as this is where the majority of the OpenGL options are enabled (lighting/transparency/material) as well as defining the view frustum. After that is done it calls MyCube to instantiate a new cube and then chooses a texture from resources to load. On touch input (which is listened for in the MyGLView class) it calculates the change in (x, y) from your input, multiplies it by a touch scale factor, and adds it to the angle change. It rotates on its axis by redrawing the cube every frame based on the change in angle. MyGLView simply acts as a handler between the UI and the MyGLRenderer class as well as providing the touch event handler for user input.
