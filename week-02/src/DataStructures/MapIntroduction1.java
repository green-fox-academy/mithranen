package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {

  public static void main(String[] args) {
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
  }
}
