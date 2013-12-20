// Tut12a.java

package turtle.tut12a;

import turtle.*;

public class Tut12a extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);  // Necessary
    setPenColor(RED);
    fillToPoint(0, - 50);
    setDragEnabled(true);
  }
  
  public void playgroundDragged(double x, double y)
  {
    if (distance(x, y) > 10)
      moveTo(x, y);
  }
}



