package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class DataStructuresFirst3 {

  public static void main(String[] args) {

    //1. List introduction I ----------------
    System.out.println("\n==============> 1. List introduction I");
    //We are going to play with lists. Feel free to use the built-in methods where possible.

    //Create an empty list which will contain names (strings)
    List<String> myArrayList = new ArrayList<>();

    //Print out the number of elements in the list
    System.out.println(myArrayList.size());

    //Add William to the list
    //Print out whether the list is empty or not
    myArrayList.add("Wiliam");
    System.out.println(myArrayList.isEmpty());

    //Add John to the list
    //Add Amanda to the list
    myArrayList.add("John");
    myArrayList.add("Amanda");

    //Print out the number of elements in the list
    //Print out the 3rd element
    System.out.println(myArrayList.size());
    System.out.println(myArrayList.get(2));

    //Iterate through the list and print out each name
    //William
    //John
    //Amanda

    //with enhanced for
    System.out.println(myArrayList);
    for (String s : myArrayList) {
      System.out.println(s);
    }
/*  With for
    System.out.println(myArrayList);
    for (int i = 0; i < myArrayList.size(); i++) {
      System.out.println(myArrayList.get(i));
    }*/

    /*Iterator<String> myIterator = myArrayList.iterator();
    while (myIterator.hasNext()) {
      System.out.println(myIterator.next());
    }*/

    //Iterate through the list and print
    // 1. William
    // 2. John
    // 3. Amanda

    for (int i = 0; i < myArrayList.size(); i++) {
      int serial = ((myArrayList.size() - 2 + (i)));
      System.out.println(serial + ". " + myArrayList.get(i));
    }

    //Remove the 2nd element
    myArrayList.remove(1);
    System.out.println(myArrayList);

    //Iterate through the list in a reversed order and print out each name
    //     Amanda
    //   William

    for (int i = 0; i < myArrayList.size(); i++) {
      System.out.println(myArrayList.get(myArrayList.size() - 1 - i));
    }

    // Remove all elements
    myArrayList.clear();
    System.out.println(myArrayList.isEmpty());

    //2. Map introduction I ----------------
    System.out.println("\n==============> 2. Map introduction I");
    //We are going to play with maps. Feel free to use the built-in methods where possible.

    //Create an empty map where the keys are integers and the values are characters
    Map<Integer, String> myMap = new HashMap<>();

    //Print out whether the map is empty or not
    System.out.println(myMap.isEmpty()); //üres-e a myMap metódus

    //Add the following key-value pairs to the map
    //Key Value 97 a 98 b 99 c 65 A 66 B 67 C
    myMap.put(97, "a");
    myMap.put(98, "b");
    myMap.put(99, "c");
    myMap.put(65, "A");
    myMap.put(66, "B");
    myMap.put(67, "C");

    //Print all the keys
    //Print all the values
    System.out.println(myMap.keySet()); //key kulcsoknak összeszedése metódus
    System.out.println(myMap.values()); //értékek összesedése metódus

    //Add value D with the key 68
    //Print how many key -value pairs are in the map
    myMap.put(68, "D");
    System.out.println(myMap.size());
    System.out.println(myMap.entrySet()); //entry (key-value) összeszedése

    //Print the value that is associated with key 99
    //Remove the key - value pair where with key 97
    System.out.println(myMap.get(99));   //get key alapján lekéri a value-t
    myMap.remove(97); //töröl key alapján
    System.out.println(myMap);

    //Print whether there is an associated value with key 100 or not
    System.out.println(myMap.containsKey(100)); //key alapján van-e 100 key hez érték a Map-en

    //Remove all the key -value pairs */
    myMap.clear();
    System.out.println(myMap.isEmpty()); //check

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
