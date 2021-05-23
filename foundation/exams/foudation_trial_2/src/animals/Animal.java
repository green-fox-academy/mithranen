package animals;

public abstract class Animal {

  //
//Fields
  protected String name;
  protected String ownerName;
  protected boolean isHealthy;
  protected int healCost;
  protected boolean isAdoptable;

  //Constructors
  public Animal() {
    name = "Animal";
  }

  public Animal(String name, String ownerName, boolean isHealthy, int healCost,
      boolean isAdoptable) {
    this.name = name;
    this.ownerName = ownerName;
    this.isHealthy = isHealthy;
    this.healCost = healCost;
    this.isAdoptable = isAdoptable;
  }

//Methods

  public void heal() {
    isHealthy = true;
  }

  public boolean isAdoptable() {
    return isHealthy;
  }

  @Override
  public String toString() {
    if (isHealthy) {
      return name + " is healty, and adoptable.";
    }
    return name + " is not healthy (" + healCost + "€)" + " and it is not adobtable.";
  }

//Getters setters

}

