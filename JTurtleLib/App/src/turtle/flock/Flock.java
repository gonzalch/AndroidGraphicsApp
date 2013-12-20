// Flock.java

package turtle.flock;

import turtle.*;

public class Flock extends Playground
{
  void main()
  {
    st();
    flock(100);
  }  
    
  void flock(int s)
  {
    if (s < 5)
      return;
    for (int i = 0; i < 6; i++)
    {
      fd(s);
      flock(s / 3);
      bk(s);
      rt(60);
    }
  }

}
