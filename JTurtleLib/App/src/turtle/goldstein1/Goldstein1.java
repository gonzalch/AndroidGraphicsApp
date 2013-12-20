// Goldstein1.java
// Turtle Geometry by Joshua Goldstein
// Invoking 1 forward/right pair

package turtle.goldstein1;

import turtle.*;

public class Goldstein1 extends Playground
{
  int nbRep = 92;

  void main()
  {
    setPos(-40, -150);
    for (int i = 0; i < nbRep; i++)
      fd(300).rt(151);
  }

}
