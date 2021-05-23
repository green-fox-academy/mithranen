package Inheritance.GFAOrganization;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  //default értékadó constructor
  public Sponsor() {
    super(); //alapból is meghívja a Person () ilyen konstruktorát.
    this.company = "Google";
    this.hiredStudents = 0;
  }

  //parameteres constructor
  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender); //nem is kell mert Person classban benne van
    this.company = company;
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender()
            + " who represents " + company
            + " and hired " + hiredStudents + " student so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents += 1;
  }

  //Getters and setters
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}


