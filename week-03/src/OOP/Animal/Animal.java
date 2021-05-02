package OOP.Animal;

public class Animal {

  /*Create an OOP.Animal class
      Every animal has a hunger value, which is a whole number
      Every animal has a thirst value, which is a whole number
      When creating a new animal instance these values must be set to the default 50 value
      Every animal can eat() which decreases its hunger by one
      Every animal can drink() which decreases its thirst by one
      Every animal can play() which increases both its hunger and thirst by one*/
  private int hunger;
  private int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eating() {
    this.hunger--; //this akár törölhető
  }

  public void drinking() {
    this.thirst--;
  }

  public void playing() {
    this.hunger++;
    this.thirst++;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
