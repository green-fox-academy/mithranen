package DataStructures;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {

  public static void main(String[] args) {
    Map<String, Integer> database = new HashMap<>(
        Map.of("Eggs", 200, "Milk", 200, "Fish", 400, "Apples", 150, "Bread", 50, "Chicken", 550));

    //- Which products cost less than 201? (just the name)
    System.out.println(getLessValuesThan201(database));

    //- Which products cost more than 150? (name + price)
    System.out.println(getProductOver150(database));
  }

  public static List<String> getLessValuesThan201(Map<String, Integer> kiskutya) {
    List<String> productNames = new ArrayList<>();
    for (String key : kiskutya.keySet()) {
      if (kiskutya.get(key) < 201) {
        productNames.add(key);
      }
    }
    return productNames;
  }

  public static Map<String, Integer> getProductOver150(Map<String, Integer> kiskutya) {
    Map<String, Integer> productEntries = new HashMap<>();
    for (String key : kiskutya.keySet()) {
      if (kiskutya.get(key) > 150) {
        productEntries.put(key, kiskutya.get(key));
      }
    }
    return productEntries;
  }
}
