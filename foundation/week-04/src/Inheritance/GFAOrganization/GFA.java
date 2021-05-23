package Inheritance.GFAOrganization;

import java.util.ArrayList;

public class GFA {

  public static void main(String[] args) {
  ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();

    //otthoni felület
    /*ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> InheritanceMatRev.students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();
    ArrayList<Sponsor> sponsors = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    InheritanceMatRev.students.add(john);
    Student student = new Student();
    InheritanceMatRev.students.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    mentors.add(gandhi);
    Mentor mentor = new Mentor();
    mentors.add(mentor);
    Sponsor sponsor = new Sponsor();
    sponsors.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    sponsors.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    for (Student person : InheritanceMatRev.students) {
      person.introduce();
      person.getGoal();
    }

    for (Mentor person : mentors) {
      person.introduce();
      person.getGoal();
    }

    for (Sponsor person : sponsors) {
      person.introduce();
      person.getGoal();
    }*/
  }
}
