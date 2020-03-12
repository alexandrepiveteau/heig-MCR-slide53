package world;

import org.junit.jupiter.api.Test;
import world.excellent.ExcellentPeopleFactory;
import world.good.GoodPeopleFactory;

public class WorldTest {

  public void testFactoryWorks(PeopleFactory factory) {
    World world = new World(factory);
    world.lifeGoesOn();
  }

  @Test
  public void testExcellentWorld() {
    testFactoryWorks(new ExcellentPeopleFactory());
  }

  @Test
  public void testGoodWorld() {
    testFactoryWorks(new GoodPeopleFactory());
  }

}
