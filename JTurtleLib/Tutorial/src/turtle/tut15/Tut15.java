// Tut15.java

package turtle.tut15;

import turtle.*;
import java.util.*;

public class Tut15 extends Playground
{
  private static ArrayList<VitalTurtle> zoo = 
    new ArrayList<VitalTurtle>();

  void main()
  {
    for (int i = 0; i < 10; i++)
    {
      VitalTurtle t = new VitalTurtle();
      zoo.add(t);
      delay(2000);
    }
  }

  class VitalTurtle extends Turtle implements Runnable
  {
    public VitalTurtle()
    {
      super(RED);
      new Thread(this).start();
    }

    public void run()
    {
      while (true)
      {
        lt((int)(Math.random() * 180) - 90);
        fd(10);
        if (isOnBorder())
          rt(180).fd(20);
        if (isProximity())
        {
          lt(180).fd(40);
          if (getColor() == RED)
            setColor(GREEN);
          else
            setColor(RED);
        }
      }
    }

    private boolean isProximity()
    {
      for (VitalTurtle t : zoo)
      {
        if (t != this)
        {
          double x = t.getX() - getX();
          double y = t.getY() - getY();
          if (x * x + y * y < 400)
            return true;
        }
      }
      return false;
    }

  }

}