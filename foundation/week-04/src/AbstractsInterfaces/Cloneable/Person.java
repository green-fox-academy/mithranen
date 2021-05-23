package AbstractsInterfaces.Cloneable;

public class Person {

  private String name;
  private int age;
  private String gender;

  //default értékadó constructor
  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  //parameteres constructor
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "!");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    } else {
      throw new IllegalArgumentException("You must set the age above 0!");
    }
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}

