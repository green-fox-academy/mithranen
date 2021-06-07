package com.example.frontend.models.greeter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

  private String name;
  private String title;
  private String welcome_message;

  public Person(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

 /* @Override
  public String toString() {
    return "Oh, hi there " + name + ", my dear " + title;
  }*/
}
