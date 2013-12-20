// Tut13.java

package turtle.tut13;

import turtle.*;

public class Tut13 extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);
    int i, k;
    for (i = 0; i <= 150; i += 15)
    {
      for (k = 0; k <= 150; k += 15)
      {
        setPos(i, 0);
        moveTo(k, 150);
      }
    }

    for (i = 0; i <= 150; i += 15)
    {
      for (k = 0; k <= 150; k += 15)
      {
        setPos(0, i);
        moveTo(150, k);
      }
    }
  }

}
