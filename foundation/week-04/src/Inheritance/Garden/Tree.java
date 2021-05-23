package Inheritance.Garden;

public class Tree extends Plant {

  //
  //Constructors
  public Tree(String color) {
    super(color, 0.4, "Tree");
  }

  //
  //Methods
  @Override
  public boolean isThirsty() {
    return waterLevel < 10;
  }

}
