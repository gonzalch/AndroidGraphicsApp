// Tut17.java
// Turtle fling event

package turtle.tut17;

import turtle.*;

public class Tut17 extends Playground
{
  public void playgroundFlung(double xStart, double yStart, 
    double xEnd, double yEnd, double v, double dir)
  {
     Turtle t = new Turtle(xEnd, yEnd);
     t.setSpeed(MAXSPEED);
     t.setHeading(dir);
     t.setSpeed((int)(v / 100));
     cloth(t, 10, (Math.random() < 0.5)? true : false);
  }
  
  void cloth(Turtle t, int s, boolean isLeft)
  {
    if (s > 1000)
      return;
    t.fd(5);
    if (isLeft)
      t.lt(0.025 * s);
    else
      t.rt(0.025 * s);
    cloth(t, s + 5, isLeft);
  }
}


