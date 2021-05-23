package Inheritance.Garden;

public abstract class Plant {

  //
  //Fields
  protected double waterLevel;
  protected String color;
  protected double absorbRate;
  protected String plantType;

  //
  //Constructors
  public Plant(String color, double absorbRate, String plantType) {
    this.waterLevel = 0;
    this.color = color;
    this.absorbRate = absorbRate;
    this.plantType = plantType;
  }

  //
  //Methods
  public abstract boolean isThirsty();

  @Override
  public String toString() {
    if (isThirsty()) {
      return "The " + color + " " + plantType + " needs water";
    }
    return "The " + color + " " + plantType + " doesn't need water";
  }
}


