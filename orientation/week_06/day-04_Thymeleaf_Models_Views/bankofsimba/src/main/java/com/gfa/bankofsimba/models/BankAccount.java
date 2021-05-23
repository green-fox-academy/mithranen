package com.gfa.bankofsimba.models;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {

  private static AtomicInteger counter = new AtomicInteger(1);

  //
  //Fields
  private int accountId;
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isReliable;

  //
  //Constructors
  public BankAccount(String name, double balance, String animalType, boolean isKing,
      boolean isReliable) {
    this.accountId = counter.getAndIncrement();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isReliable = isReliable;
  }

  //
  //Methods
  public String decideIsKing() {
    if (this.isKing) {
      return "King";
    }
    return "lowlife";
  }

  public String vlmi(){
    return isKing ? "gold" : "red";
  }

  public String isReliable() {
    if (this.isReliable) {
      return "God one";
    }
    return "Bad guy";
  }

//  public String isReliable() {
//    String result;
//    switch () {
//      case 1:
//        isReliable = true;
//        result = "God one";
//        break;
//      case 2:
//        isReliable = false;
//        result = "Bad guy";
//        break;
//    }
//    return result;
//  } TOdo with switch case !!!!!

  //
  //Getter and setter
  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public void setReliable(boolean reliable) {
    isReliable = reliable;
  }
}
