package Inheritance.Garden;

public class Flower extends Plant {

  //
  //Constructors
  public Flower(String color) {
    super(color, 0.75, "Flower");
  }

  //
  //Methods
  @Override
  public boolean isThirsty() {
    return waterLevel < 5;
  }

}
