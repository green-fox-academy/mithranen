package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {

  public static void main(String[] args) {
    //3. List introduction II ----------------
    System.out.println("\n==============> 3. List introduction II");
    //Create a list ('List A') which contains the following values
    //Apple, Avocado, Blueberries, Durian, Lychee
    List<String> ListA =
        new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    /*{
      {
        add("Apple");
        add("Avocado");
        add("Blueberries");
        add("Durian");
        add("Lychee");
      }
    };*/
    //ListA.add("Apple");
    //ListA.add("Avocado");
    //ListA.add("Blueberries");
    //ListA.add("Durian");
    //ListA.add("Lychee");
    //List<String> ListB = new ArrayList<>();

    //    Create a new list('List B') with the values of List A
    List<String> ListB = new ArrayList<>(ListA);

    //    Print out whether List A contains Durian or not
    System.out.println(ListA.contains("Durian"));

    //    Remove Durian from List B
    ListB.remove("Durian"); //index vagy object is megadható

    //    Add Kiwifruit to List A after the 4 th element
    ListA.add(4, "Kiwi");
    System.out.println(ListA);

    //    Compare the size of List A and List B
    System.out.println(ListA.equals(ListB)); //Compare the size of List A and List B????

    //    Get the index of Avocado from List A
    System.out.println(ListA.indexOf("Avocado"));

    //    Get the index of Durian from List B
    System.out.println(ListB.indexOf("Durian")); //-1 mert nincs is rajta a listán

    //    Add Passion Fruit and Pomelo to List B in a single statement
    ListB.addAll(Arrays.asList("Passion Fruits", "Polemo"));
    System.out.println(ListB);

    //    Print out the 3 rd element from List A
    System.out.println(ListA.get(2));
    System.out.println(ListA);
  }

}
