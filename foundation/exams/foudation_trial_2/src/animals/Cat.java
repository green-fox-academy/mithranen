package animals;

public class Cat extends Animal {

  public Cat() {
    name = "Cat";
    healCost = RandomNumberGenerator.generateRandomNumber(0, 6);
  }

}
