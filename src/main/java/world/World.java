package world;

import world.excellent.ExcellentPeopleFactory;

public class World {

  private Hero hero;
  private Villain villain;

  public World(PeopleFactory factory) {
    this.hero = factory.createHero();
    this.villain = factory.createVillain();
  }

  public void lifeGoesOn() {
    hero.findsAndCatches(villain);
  }

  public static void main(String[] args) {
    World world = new World(new ExcellentPeopleFactory());
    world.lifeGoesOn();
  }

}
