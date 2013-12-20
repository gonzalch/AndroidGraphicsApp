// Peano.java

package turtle.peano;

import turtle.*;

public class Peano extends Playground
{
  void main()
  {
    setSpeed(MAXSPEED);
    peano(5, 5, 90);
  }

  void peano(int n, int s, int w)
  {
    if (n == 0)
      return;
    lt(w);
    peano(n - 1, s, -w);
    fd(s);
    rt(w);
    peano(n - 1, s, w);
    fd(s);
    peano(n - 1, s, w);
    rt(w);
    fd(s);
    peano(n - 1, s, -w);
    lt(w);
  }

}