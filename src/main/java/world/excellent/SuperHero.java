package world.excellent;

import world.Hero;
import world.Villain;

public class SuperHero implements Hero {
  @Override
  public void findsAndCatches(final Villain villain) {
    System.out.println("You're destroyed by a laser " + villain);
  }
}
