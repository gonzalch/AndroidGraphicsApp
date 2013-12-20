// Menger.java

package turtle.menger;

import turtle.*;

public class Menger extends Playground
{
  void main()
  {
    setSpeed(MAXSPEED).
    pu().bk(120).lt(90).bk(50).rt(90).pd();
    menger(3, 81 * 2);
  }

  void menger(int n, double size)
  {
    if (n > 0)
    {
      menger(n - 1, size / 3);
      pu().lt(90).fd(size / 3).rt(90).pd();
      menger(n - 1, size / 3);
      pu().lt(90).fd(size / 3).rt(90).pd();
      menger(n - 1, size / 3);
      pu().fd(size / 3).pd();
      menger(n - 1, size / 3);
      pu().fd(size / 3).pd();
      menger(n - 1, size / 3);
      pu().lt(90).bk(size / 3).rt(90).pd();
      menger(n - 1, size / 3);
      pu().lt(90).bk(size / 3).rt(90).pd();
      menger(n - 1, size / 3);
      pu().bk(size / 3).pd();
      menger(n - 1, size / 3);
      pu().bk(size / 3).pd();
    }
    else
    {
      for (int i = 0; i < 4; i++)
      {
        fd(size).lt(90);
      }
    }
  }

}