// Hilberjava

package turtle.hilbert;

import turtle.*;

public class Hilbert extends Playground
{
  void main()
  {
    setSpeed(MAXSPEED);
    fig(5, 5, 90);
  }

  void fig(int n, int s, int w)
  {
    if (n == 0)
      return;
    lt(w);
    fig(n - 1, s, -w);
    fd(s);
    rt(w);
    fig(n - 1, s, w);
    fd(s);
    fig(n - 1, s, w);
    rt(w);
    fd(s);
    fig(n - 1, s, -w);
    lt(w);
  }
}
