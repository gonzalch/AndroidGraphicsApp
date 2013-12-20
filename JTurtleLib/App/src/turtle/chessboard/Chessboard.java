// Chessboard.java

package turtle.chessboard;

import turtle.*;

public class Chessboard extends Playground
{
  void main()
  {
    st();
    rectangle(0, 0, 160, 160, false);
    for (int i = 0; i < 8; i++)
      for (int j = 0; j < 8; j++)
        if ((i + j) % 2 == 0)
          rectangle(20 * i, 20 * j, 20 * (i + 1), 20 * (j + 1), true);
  }

  void rectangle(double ulx, double uly, double lrx, double lry, boolean fill)
  {
    setPos(ulx, uly);
    moveTo(lrx, uly);
    moveTo(lrx, lry);
    moveTo(ulx, lry);
    moveTo(ulx, uly);
    if (fill)
    {
      setPos(ulx + 1, uly + 1);
      fill();
    }
  }
  
}


