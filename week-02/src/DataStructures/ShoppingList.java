package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//# Shopping list
//
//    !We are going to represent a shopping list in a list containing strings.
//
//    !- Create a list with the following items.
//    !- Eggs, milk, fish, apples, bread and chicken
//    !- Create an application which solves the following problems.
//    - Do we have milk on the list?
//    - Do we have bananas on the list?
public class ShoppingList {

  public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<>(
        Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

    System.out.println(istItemOnList(shoppingList, "milk"));
    System.out.println(istItemOnList(shoppingList, "bananas"));
    System.out.println(istItemOnList(shoppingList, "kiskutya"));
    System.out.println(istItemOnList(shoppingList, "apples"));
  }

  public static boolean istItemOnList(List<String> shoppingList, String searching) {
    for (String item : shoppingList) {
      if (searching.equals(item)) {
        return true;
      }
    }
    return false;
  }

//  Traditional for loop
//  public static boolean istItemOnList(List<String> shoppingList, String searching) {
//    for (int i = 0; i < shoppingList.size(); i++) {
//      if (searching.equals(shoppingList.get(i))) {
//        return true;
//      }
//    }
//    return false;
//  }
}