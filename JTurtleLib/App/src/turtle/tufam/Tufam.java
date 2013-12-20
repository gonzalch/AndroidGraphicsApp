// Tufam.java
// Pursuit curves
// The mother lays eggs in regular intervals and some breeding time after a new 
// turtle hatches (is created)

package turtle.tufam;

import turtle.*;
import java.util.ArrayList;

public class Tufam extends Playground
{
  void main()
  {
    TurtleMother laura = new TurtleMother(RED);
    laura.setPos(-100, 0);
    while (true)
      laura.walk();
  }

}

// ----------- Class TurtleMother ----------------
class TurtleMother extends Turtle
{
  final int maxFamilySize = 5;
  ArrayList<Turtle> family = new ArrayList<Turtle>();
  long eggLayingTime;

  TurtleMother(int color)
  {
    super(color);
    setSpeed(2);
    family.add(this);
    eggLayingTime = System.currentTimeMillis();  // new egg
  }

  void walk()
  {
    fd(5).rt(3);
    if (System.currentTimeMillis() - eggLayingTime > 4000
      && family.size() < maxFamilySize)
      createChild();  // new turtle baby
  }

  void createChild()
  {
    TurtleChild child = new TurtleChild(this);
    family.add(child);
    eggLayingTime = System.currentTimeMillis();  //  new egg
  }

}

// ----------- Class TurtleChild -----------------
class TurtleChild extends Turtle implements Runnable
{
  Turtle precursor;
 
  TurtleChild(TurtleMother mother)
  {
    int childID = mother.family.size();
    precursor = mother.family.get(childID - 1);
    setSpeed(Playground.MAXSPEED);
    new Thread(this).start();
  }

  public void run()
  {
    while (true)
    {
      double preX = precursor.getX();
      double preY = precursor.getY();
      setHeading(towards(preX, preY));
      double distance = distance(preX, preY);
      if (distance > 30)
        fd(distance / 10);
      sleep(100);
    }
  }

}
