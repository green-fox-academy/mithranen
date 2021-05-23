package OOP.MatRevStudent;

public class Student2 {

  //osztály paraméterei - field
  private String name;
  private String className;
  private int age;

  public static  int studentCounter=0;

  //contructors
  Student2() {studentCounter++;
  }

  Student2(String name, String className, int age) {
    this.name = name; //class-en belüli dolgokra vonatkozik itt Class OOP.MatRevStudent.Student
    this.className = className;
    setAge(age);
    studentCounter++;
  }

  Student2(String name, int age) {
    this.name = name;
    this.age = age;
    className = "Default"; //this nincs className
    studentCounter++;
  }

  //methods
  void introduceYourself() {
    System.out.println("Hello my name is " + name + " and I am " + age + "years old.");
  }

  // csak lekérés
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <= 0) {
      try {
        throw new IllegalAccessException();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    this.age = age;
  }
}
