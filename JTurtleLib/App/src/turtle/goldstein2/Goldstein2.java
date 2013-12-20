// Goldstein2.java
// Turtle Geometry by Joshua Goldstein
// Invoking 1 forward/right pair

package turtle.goldstein2;

import turtle.*;

public class Goldstein2 extends Playground
{
  int nbRep = 63;

  void main()
  {
    setPos(0, -100);
    for (int i = 0; i < nbRep; i++)
      fd(200).rt(159.72);
  }

}
