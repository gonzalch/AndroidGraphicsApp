// Tut09.java

package turtle.tut09;

import turtle.*;

public class Tut09 extends Playground
{
  Turtle joe = new Turtle(RED);
  Turtle laura = new Turtle(GREEN);

  void main()
  {
    joe.setPenColor(RED);
    joe.setPenWidth(10);
    laura.setPenColor(GREEN);
    for (int i = 0; i < 9; i++)
    {
      joe.forward(150).lt(160);
      laura.forward(150).rt(160);
    }
  }

}
