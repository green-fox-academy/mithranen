package Inheritance.GardenApplication;

public class Flower extends Plants {

  public Flower(String color, double waterLevel) {
    super(color);
    this.absorbPercent = 0.75;
    this.minWaterLevel = 5;
    this.plantType = "Flower";
  }
}
