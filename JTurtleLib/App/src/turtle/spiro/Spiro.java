// Spiro.java

package turtle.spiro;

import turtle.*;

public class Spiro extends Playground
{
  void main()
  {
    setSpeed(MAXSPEED);
    for (int i = 0; i < 5; i++)
      spirolat(1);
  }

  void spirolat(int n)
  {
    if (n == 13)
      return;
    fd(12 * n);
    lt(144);
    spirolat(n + 1);
  }

}
