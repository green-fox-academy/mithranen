package MatRevStudent;

import java.util.ArrayList;

//OOP: Encapsulation, aBastaction

public class Main {

  public static void main(String[] args) {
// Új diák létrehoz

    Student alexStudent = new Student(); //make an instance -> példányosítás
    alexStudent.setAge(25);
    //alexStudent.name = "Teper Alex";
    //alexStudent.className = "TIDBIT";
    //alexStudent.age = 25;

    System.out.println(alexStudent.getAge());
    alexStudent.setAge(25);

    Student erikStudent = new Student("Bíró Erik", "TIDBIT", 25);
    Student davidStudent = new Student("Nagy Dávid", 26);
    //System.out.println("Hello my name is " + erikStudent.name);

    System.out.println(davidStudent);

    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(alexStudent);
    studentList.add(davidStudent);

    for (int i = 0; i < studentList.size(); i++) {
      Student s = studentList.get(i);
      s.introduceYourself();

      System.out.println(Student.studentCounter);
    }
  }
}
