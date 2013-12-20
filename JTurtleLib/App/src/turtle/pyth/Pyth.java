// Pyth.java

package turtle.pyth;

import turtle.*;

public class Pyth extends Playground
{
  void main()
  {
    setSpeed(MAXSPEED);
    setPos(0, -180);
    pyth(60);
  }

  void pyth(double s)
  {
    final double alpha = 36.8699;

    if (3.0 / 5 * s < 1)
      return;

    for (int i = 0; i < 4; i++)
    {
      fd(s);
      rt(90);
    }
    pu();
    fd(s);
    lt(alpha);
    pd();
    pyth(4.0 / 5 * s);
    pu();
    rt(90);
    fd(4.0 / 5 * s);
    pd();
    pyth(3.0 / 5 * s);
    pu();
    bk(4.0 / 5 * s);
    lt(90 - alpha);
    bk(s);
    pd();
  }

}
