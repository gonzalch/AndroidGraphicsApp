// Koch.java

package turtle.koch;

import turtle.*;

public class Koch extends Playground
{
  float length = 200;
  int generations = 4;

  void main()
  {
    setPos(-180, 0);
    rt(90);
    setSpeed(MAXSPEED);
    koch(length, generations);
  }

  void koch(double l, int n)
  {
    if (n == 0)
    {
      fd(l);
      return;
    }
    koch(l / 3, n - 1);
    lt(45);
    koch(l / 3, n - 1);
    rt(90);
    koch(l / 3, n - 1);
    lt(45);
    koch(l / 3, n - 1);
  }
}
