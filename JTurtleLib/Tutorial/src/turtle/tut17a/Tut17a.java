// Tut17a.java
// Fling a selected turtle

package turtle.tut17a;

import turtle.*;

public class Tut17a extends Playground
{
  void main()
  {
    new Turtle(-100, 0, RED);
    new Turtle(0, 0, GREEN);
    new Turtle(100, 0, YELLOW);
  }

  public void playgroundFlung(double xStart, double yStart,
    double xEnd, double yEnd, double v, double dir)
  {
    Turtle t = getTopTurtleNear(xStart, yStart, 20);
    if (t == null)
      return;
    t.setSpeed(MAXSPEED);
    t.setHeading(dir);
    t.moveTo(xEnd, yEnd);
    t.setSpeed((int)(v / 100));
    t.fd(v / 10);
  }

}
