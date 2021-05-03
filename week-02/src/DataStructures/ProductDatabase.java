package DataStructures;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class ProductDatabase {

  public static void main(String[] args) {
    Map<String, Integer> database = new HashMap<>(
        Map.of("Eggs", 200, "Milk", 200, "Fish", 400, "Apples", 150, "Bread", 50, "Chicken", 550));

    //- [How much is the fish?](https://www.youtube.com/watch?v=cbB3iGRHtqA)
    System.out.println(database.get("Fish"));

    //- What is the most expensive product?
    System.out.println(mostExpensive(database));

    //- What is the cheapest product?
    System.out.println(mostCheapest(database));

    //- What is the average price?
    System.out.println(averagePrice(database));

    //- How many products' price is below 300?
    System.out.println(productsBelow300(database));

    //- Is there anything we can buy for exactly 125?
    System.out.println(isThereSthFor125(database));
  }


  public static String mostExpensive(@NotNull Map<String, Integer> database) {
    String mostExpensiveProduct = null;

    for (String key : database.keySet()) {
      if (mostExpensiveProduct == null) {
        mostExpensiveProduct = key;
      }
      if (database.get(key) > database.get(mostExpensiveProduct)) {
        mostExpensiveProduct = key;
      }
    }
    return mostExpensiveProduct;
  }

  public static String mostCheapest(Map<String, Integer> database) {
    //String mostCheapestProduct = mostExpensive(database);
    //int mostCheapestByValue = database.get(mostCheapestProduct);
    String mostCheapestProduct = null;
    int mostCheapestByValue = Integer.MAX_VALUE;

    for (String key : database.keySet()) {
      if (database.get(key) < mostCheapestByValue) {
        mostCheapestByValue = database.get(key);
        mostCheapestProduct = key;
      }
    }
    return mostCheapestProduct;
  }

  public static double averagePrice(Map<String, Integer> database) {
    int averagePrice = 0;
    for (String key : database.keySet()) {
      averagePrice += database.get(key);
    }
    return (double) averagePrice / database.keySet().size();
  }

  public static int productsBelow300(Map<String, Integer> database) {
    int productBelow300 = 0;
    for (int value : database.values()) {
      if (value < 300) {
        productBelow300 += 1;
      }
    }
    return productBelow300;
  }

  public static boolean isThereSthFor125(Map<String, Integer> database) {
    for (int value : database.values()) {
      if (value == 125) {
        return true;
      }
    }
    return false;
  }
}


