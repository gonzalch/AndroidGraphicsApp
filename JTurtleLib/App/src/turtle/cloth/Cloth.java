// Cloth.java

package turtle.cloth;

import turtle.*;

public class Cloth extends Playground
{
  int ds = 10;

  void main()
  {
    st();
    setPos(0, -100);
    cloth(10);
  }

  void cloth(int s)
  {
    if (s > 1000)
      return;
    fd(ds);
    lt(0.025 * s);
    cloth(s + ds);
  }

}
