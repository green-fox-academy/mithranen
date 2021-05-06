package animals;

public class Dog extends Animal {

  public Dog() {
    name = "Dog";
    healCost = RandomNumberGenerator.generateRandomNumber(1, 8);
  }
}
