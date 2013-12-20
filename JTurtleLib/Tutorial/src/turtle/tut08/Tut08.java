// Tut08.java

package turtle.tut08;

import turtle.*;

public class Tut08 extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);
    spiral(10);
  }

  void spiral(int s)
  {
    if (s > 200)
      return;
    fd(s);
    rt(70);
    spiral(s + 2);
  }

}
