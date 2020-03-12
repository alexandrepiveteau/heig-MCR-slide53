package world.good;

import world.Hero;
import world.Villain;

public class Cop implements Hero {
  @Override
  public void findsAndCatches(final Villain villain) {
    System.out.println("You're in prison " + villain);
  }
}
