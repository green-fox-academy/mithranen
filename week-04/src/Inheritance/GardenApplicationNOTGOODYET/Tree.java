package Inheritance.GardenApplication;

public class Tree extends Plants {

  public Tree(String color, double waterLevel) {
    super(color);
    this.absorbPercent = 0.4;
    this.minWaterLevel = 10;
    this.plantType = "Tree";
  }
}
