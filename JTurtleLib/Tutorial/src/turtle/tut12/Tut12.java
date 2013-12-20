// Tut12.java

package turtle.tut12;

import turtle.*;

public class Tut12 extends Playground
{
  void main()
  {
    st();
    setSpeed(MAXSPEED);  // Necessary
    setDragEnabled(true);
  }
  
  public void playgroundDragged(double x, double y)
  {
    setPenColor(WHITE);
    if (distance(x, y) > 10)
      moveTo(x, y);
  }

  public void playgroundReleased(double x, double y)
  {
    setPenColor(RED);
    fill(x, y);
  }

}



