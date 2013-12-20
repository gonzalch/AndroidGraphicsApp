// Spiral1.java

package turtle.spiral1;

import turtle.*;

public class Spiral1 extends Playground
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
