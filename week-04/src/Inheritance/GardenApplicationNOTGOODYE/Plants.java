package Inheritance.GardenApplicationNOTGOODYE;

public class Plants {

  protected double waterLevel;
  protected double minWaterLevel;
  protected String color;
  protected double absorbPercent;
  protected String plantType;

  public Plants(String color) {
    this.color = color;
    this.waterLevel = 0;
    this.absorbPercent = 1;
  }

  public void watering(double wateringAmount) {
    waterLevel = wateringAmount * absorbPercent + waterLevel;
    System.out
        .println("Watering with" + wateringAmount + "\n" + "Actual water level: " + waterLevel);
  }

  public void plantStatus() {
    if (waterLevel <= minWaterLevel) {
      System.out.println("The " + color + " " + plantType + " needs water.");
    } else {
      System.out.println("The " + color + " " + plantType + " doesn't need water.");
    }
  }

  //Getter and setter
  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getAbsorbPercent() {
    return absorbPercent;
  }

  public void setAbsorbPercent(double absorbPercent) {
    this.absorbPercent = absorbPercent;
  }

  public double getMinWaterLevel() {
    return minWaterLevel;
  }

  public void setMinWaterLevel(double minWaterLevel) {
    this.minWaterLevel = minWaterLevel;
  }

  public String getPlantType() {
    return plantType;
  }

  public void setPlantType(String plantType) {
    this.plantType = plantType;
  }
}
