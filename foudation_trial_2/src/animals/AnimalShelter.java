package animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

  private int budget;
  private List<Animal> animals;
  private List<String> adopters;


  public AnimalShelter() {
    this.budget = 50;
    this.animals = new ArrayList<>();
    this.adopters = new ArrayList<>();
  }

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }


  public int heal() {
    for (Animal animal : animals) {
      if (animal.isHealthy && animal.healCost <= budget) {
        animal.heal();
        budget -= animal.healCost;
        return 1;
      }
    }
    return 0;
  }

  public void addAdopter(String name) {
    adopters.add(name);
  }

  public void findNewOwner() {
    if (animals.size() > 0 && adopters.size() > 0) {
      ArrayList<Animal> adoptableAnimals = new ArrayList<>();
      for (Animal animal : animals) {
        if (animal.isAdoptable()) {
          adoptableAnimals.add((animal));
        }
      }
      int animalRandomIndex = RandomNumberGenerator
          .generateRandomNumber(0, adoptableAnimals.size() - 1);
      int adopterRandomIndex = RandomNumberGenerator.generateRandomNumber(0, adopters.size() - 1);
      //animals.remove(animalRandomIndex); --> bad solution

      Animal removableAnimal = adoptableAnimals.get(animalRandomIndex);
      animals.remove(removableAnimal);
      adopters.remove(adopterRandomIndex); //remove index ls obj alapján is tud mremovolni
    }
  }

  public int earnDonation(int amount) {
    budget += amount;
    return budget;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Budget: ").append(budget).append("€,\n");
    sb.append("There are ").append(animals.size()).append("animal(s) and").append(adopters.size())
        .append(" potential adopter(s)\n");
    for (Animal animal : animals) {
      sb.append(animal.toString()).append("\n");
    }
    return sb.toString();
  }

}
//Animal a = new Dog(); a-val rámutatok a new Dog-ra a memoriába, állat ua a két listában is létezik egyszerre, de nincs példányost
// animal a = new Dog);>>> a -> Dog_x0546
//Aniaml b = a; Y>>>> b-> a-> Doy_x0546 uyganaz az objektum
/*  public static void main(String[] args) {
    Animal a = new Dog();
    ArrayList<Animal> array = new ArrayList<>();
    ArrayList<Animal> array2 = new ArrayList<>();
    array.add(a);
    array2.add(a);
    array.remove(a);

    //array[a] -> DOG_0546
    //array2[a] -> DOG_0546
    //array[]
    //array[a] -> DOG_0546
    //
    System.out.println(array);
    System.out.println(array2);

    Animal b = new Dog();     //b -> Dog_x0546
    Animal c = b;             //c -> Dog_x0546
    b = null;                 //b  -> null
    System.out.println(c);

  }*/
