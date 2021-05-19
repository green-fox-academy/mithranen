package Streams.grouping;

public class Person {

  //fields
  private String name;
  private String country;

  //constructors
  public Person(String name, String country) {
    this.name = name;
    this.country = country;
  }

  //Methods


  @Override
  public String toString() {
    return getName();
  }

  //Getters and setters
  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }
}
