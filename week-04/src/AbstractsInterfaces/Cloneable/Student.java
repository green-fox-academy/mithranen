package AbstractsInterfaces.Cloneable;

public class Student extends Person implements java.lang.Cloneable {

  private String previousOrganization;
  private int skippedDays;

  //default értékadó constructor
  public Student() {
    super(); //alapból is meghívja a Person () ilyen konstruktorát.
    //this("Jane Doe", 30, "female","The School of Life"); előző máskáppen
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  //parameteres constructor
  public Student(String name, int age, String gender, String previousOrganization
  ) {
    super(name, age, gender);//nem is kell alapból Personban benne van
    //super.setName(name);
    //super.setAge(age);
    //super.setName(gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  public void introduce() {
    //System.out.printf("Hi, I'm %s, a %d year old %s.\n", name, age, gender");

    System.out.println(
        "Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender()
            + " from " + previousOrganization
            + " who skipped " + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    if (previousOrganization.length() > 3) {
      this.previousOrganization = previousOrganization;
    } else {
      System.err.println("I suppose it is not an existing organization");
    }
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    if (skippedDays >= 0) {
      this.skippedDays = skippedDays;
    } else {
      System.err.println("Warning! Give an positive number!");
    }
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}


