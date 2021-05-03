package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {

  public static void main(String[] args) {

    Map<String, Double> priceList = new HashMap<>(Map
        .of("Milk", 1.07, "Rice", 1.59, "Eggs", 3.14, "Cheese", 12.60, "Chicken Breasts", 9.40,
            "Apples", 2.31, "Tomato", 2.58, "Potato", 1.75, "Onion", 1.10));

    Map<String, Double> listOfBob = new HashMap<>() {{
      put("Milk", (double) 3);
      put("Rice", (double) 2);
      put("Eggs", (double) 2);
      put("Cheese", (double) 1);
      put("Chicken Breasts", (double) 4);
      put("Apples", (double) 1);
      put("Tomato", (double) 2);
      put("Potato", (double) 1);
    }};

    Map<String, Double> listOfAlice = new HashMap<>();
    listOfAlice.put("Rice", (double) 1);
    listOfAlice.put("Eggs", (double) 5);
    listOfAlice.put("Chicken Breasts", (double) 2);
    listOfAlice.put("Apples", (double) 1);
    listOfAlice.put("Tomato", (double) 10);

    System.out.println("Bob's total payment: " + sumAll(priceList, listOfBob));
    System.out.println("Alice's total payment: " + sumAll(priceList, listOfAlice));
  }

  public static double sumAll(Map<String, Double> mainList, Map<String, Double> personList) {
    double total = 0;
    for (String productKey : mainList.keySet()) {
      for (String personProductKey : personList.keySet()) {
        if (productKey.equals(personProductKey)) {
          total += mainList.get(productKey) * personList.get(personProductKey);
        }
      }
    }
    return total;
  }

  public static boolean isOneOrTheOtherMore() {
  }
}

