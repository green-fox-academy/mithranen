package Inheritance.Garden;

public class GardenApp {

  public static void main(String[] args) {
    Garden englishGarden = new Garden();

    Plant yellow = new Flower("yellow");
    englishGarden.getPlants().add(yellow);

    Plant blue = new Flower("blue");
    englishGarden.getPlants().add(blue);

    Plant purple = new Tree("purple");
    englishGarden.getPlants().add(purple);

    Plant orange = new Tree("orange");
    englishGarden.getPlants().add(orange);

    //Garden status
    englishGarden.getGardenStatus();

    //Watering garden with 40 and status
    englishGarden.watering(40);

    //Watering garden with 70 and status
    englishGarden.watering(70);

    System.out.println(yellow);
  }
}
