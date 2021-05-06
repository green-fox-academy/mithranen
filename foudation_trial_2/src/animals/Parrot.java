package animals;

public class Parrot extends Animal {
  public Parrot(){
    name="Parrot";
    healCost = RandomNumberGenerator.generateRandomNumber(4, 10);
  }
}
