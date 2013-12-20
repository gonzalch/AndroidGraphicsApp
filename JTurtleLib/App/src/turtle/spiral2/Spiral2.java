// Spiral2.java

package turtle.spiral2;

import turtle.*;

public class Spiral2 extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);
    setPos(-150, -100);
    spiral(10);
  }

  void spiral(int s)
  {
    if (s > 200)
      return;
    spiral(s + 2);
    fd(s);
    rt(70);
  }

}
