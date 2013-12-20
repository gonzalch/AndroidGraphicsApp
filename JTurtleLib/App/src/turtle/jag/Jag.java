// Jag.java

package turtle.jag;

import turtle.*;

public class Jag extends Playground
{
  void main()
  {
    st();
    for (int i = 0; i < 4; i++)
    {
      jag();
      right(60);
    }
    setPenColor(RED);
    fill(-10, 10);
  }

  void jag()
  {
    forward(100);
    left(150);
    forward(100);
  }
}