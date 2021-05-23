package OOP.MatRevStudent;

import java.util.ArrayList;

//OOP: Encapsulation, aBastaction

public class Main {

  public static void main(String[] args) {
// Új diák létrehoz

    Student2 alexStudent = new Student2(); //make an instance -> példányosítás
    alexStudent.setAge(25);
    //alexStudent.name = "Teper Alex";
    //alexStudent.className = "TIDBIT";
    //alexStudent.age = 25;

    System.out.println(alexStudent.getAge());
    alexStudent.setAge(25);

    Student2 erikStudent = new Student2("Bíró Erik", "TIDBIT", 25);
    Student2 davidStudent = new Student2("Nagy Dávid", 26);
    //System.out.println("Hello my name is " + erikStudent.name);

    System.out.println(davidStudent);

    ArrayList<Student2> studentList = new ArrayList<>();
    studentList.add(alexStudent);
    studentList.add(davidStudent);

    for (int i = 0; i < studentList.size(); i++) {
      Student2 s = studentList.get(i);
      s.introduceYourself();

      System.out.println(Student2.studentCounter);
    }
  }
}
