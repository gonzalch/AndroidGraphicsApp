// Tut07.java

package turtle.tut07;

import turtle.*;

public class Tut07 extends Playground
{
  void main()
  {
    for (int i = 0; i < 60; i++)
    {
      square(2 * i);
      rt(6);
    }
  }
  
  void square(double side)
  {
    for (int i = 0; i < 4; i++)
    {
      fd(side);
      rt(90);
    }
  }
}
