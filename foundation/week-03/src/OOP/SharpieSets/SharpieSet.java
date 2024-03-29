package OOP.SharpieSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Reuse your OOP.Sharpie class
Create SharpieSet class
it contains a list of OOP.Sharpie
        it has a method that adds a new OOP.Sharpie to the set: add(sharpie)
    it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
    it has a method that removes all unusable Sharpies: removeTrash()*/
public class SharpieSet {

  //maybe creating new OOP.Sharpie in Main?
  private List<SharpieReUse> sharpieSet = new ArrayList<>(Arrays.asList
      (new SharpieReUse("red", 12),
          new SharpieReUse("yellow", 8),
          new SharpieReUse("green", 11),
          new SharpieReUse("blue", 9)
      ));

  public void add(SharpieReUse sharpie) {
    sharpieSet.add(sharpie);
  }

/*  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size(); i++) {
      SharpieReUse toDelete = sharpieSet.get(i);
      if (toDelete.getInkAmount() == 0) {
        sharpieSet.remove(toDelete); // vagy akár lehetne, ... .remove(i), de lehet csinál prbolémát
      }
    }
  }*/

  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (sharpieSet.get(i).getInkAmount() == 0) {
        sharpieSet.remove(i);
        i--;
      }
    }
  }

  public int countUsable() {
    int countUsableSharpie = 0;
    for (int i = 0; i < sharpieSet.size(); i++) {
      SharpieReUse actualSharpieReUse = sharpieSet.get(i);
      if (actualSharpieReUse.getInkAmount() != 0) {
        countUsableSharpie++;
      }
    }
    return countUsableSharpie;
  }

  //Show all current OOP.Sharpie
  public void allCurrentSharpie() {
    SharpieReUse allSharpie;
    for (int i = 0; i < sharpieSet.size(); i++) {
      sharpieSet.get(i).showValuesOfSharpie();
    }
  }

  public List<SharpieReUse> getSharpieSet() {
    return sharpieSet;
  }
}
