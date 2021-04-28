package Inheritance.GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plants> plants = new ArrayList<>();

  public void addPlant(Plants plant) {
    plants.add(plant);
  }

  public void gardenPlantsStatus() {
    for (Plants plant : plants) {
      plant.plantStatus();
    }

/*
    public void wateringPlantsIfNeed () {
*/

  }
}
