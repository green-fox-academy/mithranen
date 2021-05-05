package animal;

public class Animal {

  //
//Fields
  protected String name;
  protected String ownerName;
  protected boolean isHealthy;
  protected int healCost;
  protected boolean isAdoptable;

  //Constructors
  public Animal() {
  }

  public Animal(String name) {
    this.name = name;
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

    return
  }

//Getters setters


}
