// Tut11.java

package turtle.tut11;

import turtle.*;

public class Tut11 extends Playground
{
  void main()
  {
    st();
    L.i("speed = " + getSpeed());
    int i = 0;
    while (i < 10)
    {
      fd(10).rt(90).fd(10).lt(90);
      L.i("i = " + i);
    }  
  }
}


