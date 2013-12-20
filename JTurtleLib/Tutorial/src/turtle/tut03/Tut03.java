// Tu03.java

package turtle.tut03;

import turtle.*;

public class Tut03 extends Playground
{
  public void playgroundPressed(double x, double y)
  {
    Turtle lisa = new Turtle(x, y);
    while (true)
    {
      lisa.fd(100);
      lisa.rt(160);
    }
  }
}
