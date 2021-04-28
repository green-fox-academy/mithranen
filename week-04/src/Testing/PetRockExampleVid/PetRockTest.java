package Testing.PetRockExampleVid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PetRockTest {
  private PetRock rocky = new PetRock("Rocky");

  @Test
  public void getName() throws Exception {
    PetRock rocky = new PetRock("Rocky");
    Assertions.assertEquals("Rocky", rocky.getName());
  }


  @Test
  public void testHappyAfterPlay() throws Exception {
    PetRock rocky = new PetRock("Rocky");
    Assertions.assertFalse(rocky.isHappy());
  }
}