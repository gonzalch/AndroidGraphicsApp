// Dragon.java

package turtle.dragon;

import turtle.*;

public class Dragon extends Playground
{
  int nbGenerations = 14;

  void main()
  {
    setSpeed(MAXSPEED);
    rt(90);
    setPos(-100, 100);
    figure(250, nbGenerations, true);
  }

  void figure(double length, int n, boolean inverse)
  {
    if (n == 0)
      fd(length);
    else
    {
      int alpha = 45;
      if (inverse)
      {
        alpha = -alpha;
        inverse = !inverse;
      }
      lt(alpha);
      figure(length / Math.sqrt(2), n - 1, !inverse);
      rt(2 * alpha);
      figure(length / Math.sqrt(2), n - 1, inverse);
      lt(alpha);
    }
  }

}
