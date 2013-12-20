// Tut14.java

package turtle.tut14;

import turtle.*;

public class Tut14 extends Playground
{
  void main()
  {
    while (true)
    {
      int nbDrops = readInt("Monte-Carlo Simulation",
        "Enter the number of drops:");
      double zx, zy;
      int nbHits = 0;
      for (int i = 0; i < nbDrops; i++)
      {
        zx = Math.random();
        zy = Math.random();

        if (zx * zx + zy * zy < 1)
        {
          setPenColor(GREEN);
          nbHits++;
        }
        else
          setPenColor(RED);
        setPos(150 * zx, 150 * zy);
        dot();
      }
      showValue("Result with " + nbDrops + " drops",
        "pi = " + 4.0 * nbHits / nbDrops);
      clear();
    }
  }

}
