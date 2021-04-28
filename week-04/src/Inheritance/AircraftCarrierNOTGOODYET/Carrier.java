package Inheritance.AircraftCarrierNOTGOODYET;

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
  List<Aircraft> aircrafts = new ArrayList<>();
  private int storedAmmo;
  private int healthPoints;

  //
  //Constructors
  public Carrier(int storedAmmo, int healthPoints) {
    this.storedAmmo = storedAmmo;
    this.healthPoints = healthPoints;
  }
  //
  //Methods

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

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
    int damagedHealth = 0;
    for (Aircraft aircraft : aircrafts) {
//   damagedHealth = Carrier.this.healthPoints - aircraft.getCurrentAmmo()*aircraft.getBaseDamage(); (fight ugyanezt csinálja ezárt felesleges szorozni)
      damagedHealth = enemyCarrier.healthPoints - aircraft.fight();
    }
    enemyCarrier.healthPoints = damagedHealth;
  }

//    Gergő megoldása
//    for (Aircraft aircraft : aircrafts) {
//      enemyCarrier.healthPoints -= aircraft.fight();
//    }

  // HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
/*  public String getStatus(Carrier carrier) {
    if (healthPoints == 0) {
      return "";
    }
    String status = "HP: " + healthPoints + "| " + "Aircraft count: " + aircrafts.size() + "| "
        + "Ammo Storage: " + storedAmmo + "| " + "Total damage: " + aircrafts.size() *  ";

    for (Aircraft aircraft : aircrafts) {
      StringBuilder sb = new StringBuilder();
      status = sb.append(status).toString();
    }
    return status;*/
  }
//
//#### getStatus()
//
//  It should return a string describing its, and all of its aircrafts'
//  statuses in the following format:
//
//      ```text
//
//  Aircrafts:
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//  Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//      ```
//
//  If the health points are 0 then it should return: `It's dead Jim :(`
//

//
//Getter and setter
