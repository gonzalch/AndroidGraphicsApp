// Goldstein4.java
// Turtle Geometry by Joshua Goldstein
// Invoking 3 forward/right pairs

package turtle.goldstein4;

import turtle.*;

public class Goldstein4 extends Playground
{
  int nbRep = 47;

  void main()
  {
    setPos(130, -20);
    for (int i = 0; i < nbRep; i++)
    {
      fd(15.4).rt(140.86);
      fd(62).rt(112);
      fd(57.2).rt(130);
    }
  }

}
