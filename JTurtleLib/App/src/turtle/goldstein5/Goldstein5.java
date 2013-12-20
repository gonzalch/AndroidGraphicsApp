// Goldstein5.java
// Turtle Geometry by Joshua Goldstein
// Invoking 4 forward/right pairs

package turtle.goldstein5;

import turtle.*;

public class Goldstein5 extends Playground
{
  int nbRep = 68;

  void main()
  {
    setPos(-30, -30);
    for (int i = 0; i < nbRep; i++)
    {
      fd(31).rt(141);
      fd(112).rt(87.19);
      fd(115.2).rt(130);
      fd(186.0).rt(121.43);
    }
  }

}
