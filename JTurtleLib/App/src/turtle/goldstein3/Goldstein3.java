// Goldstein3.java
// Turtle Geometry by Joshua Goldstein
// Invoking 2 forward/right pairs

package turtle.goldstein3;

import turtle.*;

public class Goldstein3 extends Playground
{
  int nbRep = 37;

  void main()
  {
    setPos(-150, 0);
    for (int i = 0; i < nbRep; i++)
    {
      fd(77).rt(140.86);
      fd(310).rt(112);
    }
  }

}
