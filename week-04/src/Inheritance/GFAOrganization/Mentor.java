package Inheritance.GFAOrganization;

public class Mentor extends Person {

  //(junior / intermediate / senior)
 private String level;

  //default értékadó constructor
  public Mentor() {
    super(); //alapból is meghívja a Person () ilyen konstruktorát.
    this.level = "intermediate";
  }

  //parameteres constructor
  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender); // nem kell Person class-ban benne van
    this.level = level;
  }

  @Override
  public void introduce() {
    System.out
        .println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " " + level + " mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  //Getter, setter
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
