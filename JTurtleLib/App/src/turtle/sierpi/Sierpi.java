// Sierpi.java

package turtle.sierpi;

import turtle.*;

public class Sierpi extends Playground
{
  void main()
  {
    int n = 4;
    int s = 256;
    setSpeed(MAXSPEED);
    setPos(-180, -190);
    rt(90);
    sierpi(n, s);
  }

  void sierpi(int n, int s)
  {
    if (n == 0)
    {
      triangle(s);
      return;
    }
    else
    {
      sierpi(n - 1, s / 2);
      fd(s / 2);
      sierpi(n - 1, s / 2);
      lt(120);
      fd(s / 2);
      rt(120);
      sierpi(n - 1, s / 2);
      lt(60);
      bk(s / 2);
      rt(60);
    }
  }

  void triangle(int s)
  {
    for (int i = 0; i < 3; i++)
    {
      fd(s);
      lt(120);
    }
    fill(getX() + 3, getY() + 3);
  }

}