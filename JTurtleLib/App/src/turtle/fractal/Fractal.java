// Fractal.java
// Fractal tree
// From http://www.cs.berkeley.edu/~bh/v1ch10/turtle.html

package turtle.fractal;

import turtle.*;

public class Fractal extends Playground
{
  void main()
  {
    setPos(20, -195);
    tree(250);
  }

  private void tree(double size)
  {
    if (size < 5)
    {
      fd(size);
      bk(size);
      return;
    }
    fd(size / 3);
    lt(30);
    tree(size * 2 / 3);
    rt(30);
    fd(size / 6);
    rt(25);
    tree(size / 2);
    lt(25);
    fd(size / 3);
    rt(25);
    tree(size / 2);
    lt(25);
    fd(size / 6);
    bk(size);
  }

}
