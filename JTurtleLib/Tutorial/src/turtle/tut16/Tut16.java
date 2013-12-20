// Tut16.java

package turtle.tut16;

import turtle.*;

public class Tut16 extends Playground
{
  public Tut16()
  {
    super("sprites/turtlecar.png");
  }
  
  void main()
  {
    Turtle car = new Turtle(170, 0, RED);
    car.setSpeed(MAXSPEED);
    while (true)
      car.fd(3).lt(1);
  }
}


