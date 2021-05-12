package Inheritance.AircraftCarrier;

import java.util.ArrayList;
import java.util.List;
/*
## Carrier

    Create a class that represents an aircraft-carrier

    !- The carrier should be able to store aircrafts
    !- Each carrier should have a store of ammo represented by a number
    !- The initial ammo should be given as a constructor parameter
    !- The carrier also has a health point which is also given as a constructor
    parameter
*/

public class Carrier {

  //
  //Fields
  private List<Aircraft> aircrafts;
  private int storedAmmo;
  private int healthPoints;

  //
  //Constructors
  public Carrier(int storedAmmo, int healthPoints) {
    this.aircrafts = new ArrayList<>();
    this.storedAmmo = storedAmmo;
    this.healthPoints = healthPoints;
  }

  //
  //Methods
  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  //Jó de egy szót nem értek belőle - TODO hardcore one, why...
  // --> Comparable interface (Aircraft) --> compareTo override (Aircraft) --> Collection.sort using (Carrier)
/*  public void fill() {
    Collections.sort(aircrafts);
    for (Aircraft aircraft : aircrafts) {
      storedAmmo = aircraft.refillAmmo(storedAmmo);
      if (storedAmmo == 0) {
        throw new IllegalArgumentException("There is not enough ammo!");
      }
    }
  }*/

  //Earlier solution for fill()
  public void fill() {
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.isPriority()) {
        storedAmmo = aircraft.refillAmmo(storedAmmo);
      }
      if (storedAmmo == 0) {
        throw new IllegalArgumentException("There is not enough ammo!");
      }
    }
    for (Aircraft aircraft : aircrafts) {
      if (!aircraft.isPriority()) {
        storedAmmo = aircraft.refillAmmo(storedAmmo);
      }
      if (storedAmmo == 0) {
        throw new IllegalArgumentException("There is not enough ammo!");
      }
    }
  }

  public void fight(Carrier enemyCarrier) {
    int damagedHealth = enemyCarrier.healthPoints;
    for (Aircraft aircraft : aircrafts) {
//   damagedHealth = enemyCarrier.healthPoints - aircraft.getCurrentAmmo()*aircraft.getBaseDamage(); (fight ugyanezt csinálja ezárt felesleges szorozni)
      damagedHealth -= aircraft.fight();
    }
    enemyCarrier.healthPoints = damagedHealth;
//    Gergő megoldása
//    for (Aircraft aircraft : aircrafts) {
//      enemyCarrier.healthPoints -= aircraft.fight();
//    }
  }


  // HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
  public String getStatus() {
    if (healthPoints == 0) {
      return "It's dead Jim :(";
    }

    StringBuilder status = new StringBuilder(
        "HP: " + healthPoints + " | " + "Aircraft count: " + aircrafts.size() + " | "
            + "Ammo Storage: " + storedAmmo + " | " + "Total damage: "
            + totalDamageOfCarriersAircrafts() + "\n" + "Aircrafts: " + "\n");

    for (Aircraft aircraft : aircrafts) {
      status.append(aircraft.getStatus());
    }

    return status.toString();
  }

  /*  public List<String> getAllAircraftsStatus() {
    List<String> status = new ArrayList<>();
    for (Aircraft aircraft : aircrafts) {
      status.add(aircraft.getStatus());
    }
    return status;
  }*/

  private int totalDamageOfCarriersAircrafts() {
    int aircraftsCurrentDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      aircraftsCurrentDamage += aircraft.getCurrentDamage();
    }
    return aircraftsCurrentDamage;
  }

}
//Getter and setter
