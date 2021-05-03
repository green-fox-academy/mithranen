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

    //TODO Total payment
    System.out.println("Bob's total payment: " + sumPaymentAll(priceList, listOfBob));
    System.out.println("Alice's total payment: " + sumPaymentAll(priceList, listOfAlice));

    System.out.println("*******************************");

    //TODO Who buys more Rice?
    System.out.println("Alice has: " + getProductAmount(listOfAlice, "Rice") + " Rice");
    System.out.println("Bob has: " + getProductAmount(listOfBob, "Rice") + " Rice");

    whoHasMoreRice(listOfBob, listOfAlice);

    System.out.println();

    //TODO Who buys more Potato?
    System.out.println("Alice has: " + getProductAmount(listOfAlice, "Potato") + " Potato");
    System.out.println("Bob has: " + getProductAmount(listOfBob, "Potato") + " Potato");

    whoHasMorePotato(listOfBob, listOfAlice);

    System.out.println("*******************************");

    //-TODO Who buys more products? (piece)
    System.out.println(getAllProductAmount(listOfAlice));
    System.out.println(getAllProductAmount(listOfBob));

    whoBuysMoreProduct(listOfBob, listOfAlice);

    System.out.println("*******************************");

    //-TODO Who buys more different products?
    whoBuysMoteDiffProduct(listOfBob, listOfAlice);
  }

  private static void whoHasMoreRice(Map<String, Double> listOfBob,
      Map<String, Double> listOfAlice) {
    if (getProductAmount(listOfAlice, "Rice") > getProductAmount(listOfBob, "Rice")) {
      System.out.println("Alice has more Rice than Bob.");
    } else if (getProductAmount(listOfAlice, "Rice") < getProductAmount(listOfBob, "Rice")) {
      System.out.println("Bob has more Rice than Alice.");
    } else {
      System.out.println("Bob and Alice has same rice.");
    }
  }

  private static void whoHasMorePotato(Map<String, Double> listOfBob,
      Map<String, Double> listOfAlice) {
    if (getProductAmount(listOfAlice, "Potato") > getProductAmount(listOfBob, "Potato")) {
      System.out.println("Alice has more Rice than Bob.");
    } else if (getProductAmount(listOfAlice, "Potato") < getProductAmount(listOfBob, "Potato")) {
      System.out.println("Bob has more Rice than Alice.");
    } else {
      System.out.println("Bob and Alice has same amount Potato");
    }
  }

  private static void whoBuysMoreProduct(Map<String, Double> listOfBob,
      Map<String, Double> listOfAlice) {
    if (getAllProductAmount(listOfBob) > getAllProductAmount(listOfAlice)) {
      System.out.println("Bob has more pieces product.");
    } else if (getAllProductAmount(listOfBob) < getAllProductAmount(listOfAlice)) {
      System.out.println("Alice has more pieces product.");
    } else {
      System.out.println("Alice has same amount product as Bob has");
    }
  }

  private static void whoBuysMoteDiffProduct(Map<String, Double> listOfBob,
      Map<String, Double> listOfAlice) {
    if (listOfBob.keySet().size() > listOfAlice.keySet().size()) {
      System.out.println("Bob bought more different product.");
    } else if (listOfBob.keySet().size() < listOfAlice.keySet().size()) {
      System.out.println("Alice bought more different product.");
    } else {
      System.out.println("Bob and Alice bought same amount of different product.");
    }
  }

  public static double sumPaymentAll(Map<String, Double> mainList, Map<String, Double> personList) {
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

  public static double getProductAmount(Map<String, Double> someonesMap, String product) {
    double productAmount = 0;
    for (String productNameAsKey : someonesMap.keySet()) {
      if (productNameAsKey.equals(product)) {
        productAmount = someonesMap.get(productNameAsKey);
      }
    }
    return productAmount;
  }

  public static double getAllProductAmount(Map<String, Double> someonesMap) {
    double productTotalAmount = 0;
    for (String productNameAsKey : someonesMap.keySet()) {
      productTotalAmount += someonesMap.get(productNameAsKey);
    }
    return productTotalAmount;
  }
}

