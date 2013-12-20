// Tut06.java

package turtle.tut06;

import turtle.*;

public class Tut06 extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);
    for (int i = 0; i < 60; i++)
    {
      square();
      rt(6);
    }
  }
  
  void square()
  {
    for (int i = 0; i < 4; i++)
    {
      fd(100);
      rt(90);
    }
  }
}
