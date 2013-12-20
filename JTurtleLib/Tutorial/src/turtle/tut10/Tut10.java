// Tut10.java

package turtle.tut10;

import turtle.*;

public class Tut10 extends Playground
{
  void main()
  {
    for (int i = 0; i < 30; i++)
      new PainterTurtle();
  }

  class PainterTurtle extends Turtle implements Runnable
  {
    PainterTurtle()
    {
      new Thread(this).start();
      setHeading(360 * Math.random());
    }

    public void run()
    {
      fd(50 + 100 * Math.random());
      lt(45);
      for (int i = 0; i < 10; i++)
      {
        fd(50);
        bk(50);
        rt(20 * Math.random());
      }
    }
  }
}
