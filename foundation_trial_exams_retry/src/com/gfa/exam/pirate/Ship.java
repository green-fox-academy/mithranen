package com.gfa.exam.pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  //
  //Fields
  protected List<Pirate> piratesOnShip = new ArrayList<>();
  //protected Captain captain; //TODO értelmetlen, nem itt példányosítunk!!
  //protected Pirate pirates; //TODO értelmetlen, nem itt példányosítunk!!!

  //
//Constructors
// TODO nincs szükség konstruktorra;
  /*  public Ship() {
  }

  public Ship(List<Pirate> piratesOnShip, Captain captain, Pirate pirates) {
    this.piratesOnShip = piratesOnShip;
    this.captain = captain;
    this.pirates = pirates;
  }*/

  //
//Methods
//  You must be able to add new pirates to the ship. It must have only one captain!
  public void addOnePirate(Pirate pirate) {
    for (Pirate crewPirate : piratesOnShip) {
      if (pirate instanceof Captain) {
        System.err.println("There is a captain on the ship already!");
        return;
      }
//Can't add the same com.gfa.exam.pirate with the same value!!!!
      if (pirate.equals(crewPirate)) {
        System.err.println("This com.gfa.exam.pirate is already on the ship!");
        return;
      }
    }
    piratesOnShip.add(pirate);
  }

  // TODO ez így úgy ahogy van értelmetlen, mert a Pirate között lehet Captain
  //TODO és addPirate elfogadja a Captaint is!!!!(Mivel Captain a Pirate child-ja
/*  public void addPirates(Pirate com.gfa.exam.pirate) {
    piratesOnShip.add(com.gfa.exam.pirate);}

  public void addCaptain(Captain captain) {
    if (!piratesOnShip.contains(this.captain)) {
      piratesOnShip.add(captain);
    } else {
      System.out.println("There is a captain on the ship already!");
    }
  }*/

  //  getPoorPirates() which returns a list of names containing the pirates that
//  have a wooden leg and have less than 15 golds
  public List<String> getPoorPirates() {
    List<String> nameOfPoorPirates = new ArrayList<>();
    for (Pirate crewPirate : piratesOnShip) {
      if (crewPirate.amountGold < 15 && crewPirate.woodLeg) {
        nameOfPoorPirates.add(crewPirate.getName());
      }
    }
    return nameOfPoorPirates;
  }

  //TODO not good....
//  public List<Pirate> getPoorPirates() {
//    List<Pirate> listWoodLegPirates;
//    for (int i = 0; i < piratesOnShip.size(); i++) {
//      if (pirates.woodLeg || captain.woodLeg) {}
//      return listWoodLegPirates}}

  //
  //getGolds()
  //    which returns the sum of gold owned by
  //    the pirates of that particular ship
  public int getGolds() {
    int sum = 0;
    for (Pirate pirate : piratesOnShip) {
      sum += pirate.amountGold;
    }
    return sum;
  }

  //TODO baromság
    /*  public int getGolds() {
  int sum = Ship.this.pirates.amountGold + Ship.this.captain.amountGold;
    return sum;}*/

  //  lastDayOnTheShip()
//    which calls the pirates' party() method.
  public void lastDayOnTheShip() {
    for (Pirate pirate : piratesOnShip) {
      pirate.party();
    }
  }

  //TODO baromság
/*  public void lastDayOnTheShip(Pirate com.gfa.exam.pirate) {
    if (com.gfa.exam.pirate.equals(this.captain)) {
      captain.party();
    } else {
      pirates.party(); } }*/

  //  prepareForBattle() which calls
//     the pirates' work() method 5 times
//     then the ship's lastDayOnTheShip() method.

  public void prepareForBattle() {
    for (Pirate pirate : piratesOnShip) {
      for (int i = 0; i < 5; i++) {
        pirate.work();
      }
    }
    lastDayOnTheShip();
  }

  //TODO baromság
/*  public void prepareForBattle(Pirate com.gfa.exam.pirate) {
    if (com.gfa.exam.pirate.equals(this.captain)) {
      for (int i = 0; i < 5; i++) {
        captain.work();
      }
    }
    if (com.gfa.exam.pirate.equals(this.pirates)) {
      for (int i = 0; i < 5; i++) {
        com.gfa.exam.pirate.work();
      }
    }
    lastDayOnTheShip(com.gfa.exam.pirate);
  }*/
}
//
//Getter and setter
