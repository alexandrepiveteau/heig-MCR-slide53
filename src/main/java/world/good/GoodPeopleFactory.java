package world.good;

import world.Hero;
import world.PeopleFactory;
import world.Villain;

public class GoodPeopleFactory implements PeopleFactory {
  @Override
  public Hero createHero() {
    return new Cop();
  }

  @Override
  public Villain createVillain() {
    return new Gangster();
  }
}
