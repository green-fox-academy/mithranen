package com.gfa.programmerfoxclub.modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {

  //
  //Fields
  private String name;
  private List<Trick> trickList;
  private Food food;
  private Drink drink;

  //
  //Constructors
  public Fox(String name) {
    this.name = name;
    this.trickList = new ArrayList<>(Arrays.asList(Trick.AMBUSH));
    this.food = Food.HIKER;
    this.drink = Drink.SCOTCH;
  }

  public Fox(String foxName, List<Trick> trickList, Food food, Drink drink) {
    this(foxName, food, drink); //useing 34 constructor - constructor reusing
    this.trickList = trickList;
  }

  public Fox(String foxName, Food food, Drink drink) {
    this.name = foxName;
    this.trickList = trickList;
    this.food = food;
    this.drink = drink;
  }

  //
  //Methods
/*  @Override
  public String toString() {
    if (!trickList.isEmpty()) {
      return "This is "
          + name + "."
          + "Currently living on " + food + " and " + drink + "."
          + "He knows " + trickList + " tricks.\n";
    }
    return "This is "
        + name + "."
        + "Currently living on " + food + " and " + drink + "."
        + "He knows " + 0 + " tricks.\n";
  }*/

  //
  //Getter and setter
  //By Lombok

}
