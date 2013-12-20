// SwissFlag.java

package turtle.swissflag;

import turtle.*;

public class SwissFlag extends Playground
{
  void main()
  {
    st();
    setSpeed(10);
    clean(RED);
    setPos(-50, 50);
    for (int k = 0; k < 4; k++)
    {
      for (int i = 0; i < 3; i++)
      {
        fd(100);
        rt(90);
      }
      lt(180);
    }
    setPos(0, 0);
    fill();
    hideTurtle();
  }

}