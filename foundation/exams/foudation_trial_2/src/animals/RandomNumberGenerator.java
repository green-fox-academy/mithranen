package animals;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomNumberGenerator {

  public static int generateRandomNumber(int min, int max) {
    //int number = (int) (Math.random() * max + min);
    Random random = new Random();
    return random.nextInt(max + 1 - min) + min;
  }

}
