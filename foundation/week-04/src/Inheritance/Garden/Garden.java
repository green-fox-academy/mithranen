package Inheritance.Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  //
  //Fields
  private List<Plant> plants;

  //
  //Constructors
  public Garden() {
    this.plants = new ArrayList<>();
  }

  //
  //Methods
  public void getGardenStatus() {
    for (Plant plant : plants) {
      System.out.println(plant);
    }
    System.out.println();
  }

  public void watering(double wateringAmount) {
    double waterForOnePlant = wateringAmount / amountOfThirstyPlant();
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        plant.waterLevel += waterForOnePlant * plant.absorbRate;
      }
    }
    System.out.println("Watering with " + (int) wateringAmount);
    getGardenStatus();
  }

  private int amountOfThirstyPlant() {
    int thirstyPlants = 0;
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }

  //
  //Getters and Setters
  public List<Plant> getPlants() {
    return plants;
  }
}


