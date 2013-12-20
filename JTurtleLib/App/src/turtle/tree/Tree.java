// Tree.java

package turtle.tree;

import turtle.*;

public class Tree extends Playground
{
  void main()
  {
    st();
    setY(-64);
    tree(128);
  }

  void tree(int s)
  {
    if (s < 16)
      return;
    fd(s);
    lt(45);
    tree(s / 2);
    rt(90);
    tree(s / 2);
    lt(45);
    bk(s);
  }

}
