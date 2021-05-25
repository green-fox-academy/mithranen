package com.gfa.mywebshop.models;

public class ShopItem {

  //
  //Fields
  private String name;
  private String description;
  private int duration;
  private String toxicity;
  private String type;
  private int quantityOfStock;
  private int price;

  //
  //Constructors

  public ShopItem(String name, String description, int duration, String toxicity,
      String type, int quantityOfStock, int price) {
    this.name = name;
    this.description = description;
    this.duration = duration;
    this.toxicity = toxicity;
    this.type = type;
    this.quantityOfStock = quantityOfStock;
    this.price = price;
  }

  //
  //Methods


  //
  //Getter and setter
  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getDuration() {
    return duration;
  }

  public String getToxicity() {
    return toxicity;
  }

  public String getType() {
    return type;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public int getPrice() {
    return price;
  }
}
