package world.excellent;

import world.Hero;
import world.PeopleFactory;
import world.Villain;

public class ExcellentPeopleFactory implements PeopleFactory {
  @Override
  public Hero createHero() {
    return new SuperHero();
  }

  @Override
  public Villain createVillain() {
    return new SuperVillain();
  }
}
