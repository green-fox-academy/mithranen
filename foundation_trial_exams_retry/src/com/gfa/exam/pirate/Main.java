package com.gfa.exam.pirate;

public class Main {

  public static void main(String[] args) {
    Ship blackPearl = new Ship();

    Pirate sparrow = new Captain("Jack Sparrow", false, 20);
    Captain anne = new Captain("Anne Bonny", false);

    Pirate jack = new Pirate("Dirty Jack", true, 6);
    Pirate jane = new Pirate("Jane Calamity", false, 15);
    Pirate joe = new Pirate("Joe The Rat", false);
    Pirate pedro = new Pirate("Perdo Padre", false);

    blackPearl.addOnePirate(sparrow);//TODO ez már nem fog létrejönni, tönkre vágja a kódot miért?
    //blackPearl.addOnePirate(anne); //TODO ez már nem fog létrejönni, tönkre vágja a kódot miért?

    blackPearl.addOnePirate(jack);
    blackPearl.addOnePirate(jane);
    blackPearl.addOnePirate(joe);
    blackPearl.addOnePirate(pedro);
    blackPearl.addOnePirate(pedro);
//    blackPearl.addOnePirate(sparrow);//TODO de itt már hozzáadja és kiírja!!!

    sparrow.work();
    sparrow.party();

/*    System.out.println(anne + "\n" + anne.pirateAllStat());
    System.out.println(sparrow + "\n" + sparrow.pirateAllStat() + "\n");
    System.out.println("----------");*/
    System.out.println(blackPearl.piratesOnShip.size());

    for (Pirate pirate : blackPearl.piratesOnShip) {
      System.out.println(pirate + "\n" + pirate.pirateAllStat());
    }
  }
}
