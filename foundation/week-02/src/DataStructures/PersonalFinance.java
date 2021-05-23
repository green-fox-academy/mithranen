package DataStructures;

//Personal finance
//    We are going to represent our expenses in a list containing integers.
//
//    +Create a list with the following items.
//    +500, 1000, 1250, 175, 800 and 120
//    +Create an application which solves the following problems.
//    +How much did we spend?
//    +Which was our greatest expense?
//    +Which was our cheapest spending?
//    +What was the average amount of our spendings?

import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {


  //Fields
  private List<Integer> spendingList = new ArrayList(); // ide is lehet, ha static

  public static void main(String[] args) {
    PersonalFinance firsShopping = new PersonalFinance();
    PersonalFinance secondShopping = new PersonalFinance();
    PersonalFinance pertolSpending = new PersonalFinance();

    firsShopping.spendingList.add(500);
    firsShopping.spendingList.add(1000);
    firsShopping.spendingList.add(1250);
    firsShopping.spendingList.add(175);
    firsShopping.spendingList.add(800);
    firsShopping.spendingList.add(120);

    secondShopping.spendingList.add(120);

    pertolSpending.spendingList.add(1234);
    pertolSpending.spendingList.add(1244);
    pertolSpending.spendingList.add(3444);

    System.out.println("All spending during first shopping : " + firsShopping.spendingSum());
    System.out
        .println("Average spending during first shopping : " + firsShopping.averageSpending());
    System.out
        .println("Cheapest spending during first shopping : " + firsShopping.getCheapestExpense());
    System.out
        .println("Greatest spending during first shopping : " + firsShopping.getGreatestExpense());

  }

  //Methods
  public int spendingSum() {
    int sum = 0;
    for (int spending : spendingList) {
      sum += spending;
    }
    return sum;
  }

  public int averageSpending() {
    return spendingSum() / spendingList.size();
  }


  //TODO nagyon fukar megoldás!!xd
  public int getCheapestExpense() {
    int cheapestExpense = getGreatestExpense();
    for (Integer spending : spendingList) {
      if (cheapestExpense > spending) {
        cheapestExpense = spending;
      }
    }
    return cheapestExpense;
  }

  // Traditional way with fori loop
/*  public int getCheapestExpense2() {
    int cheapestExpense = spendingList.get(0);
    for (int i = 0; i < spendingList.size(); i++) {
      if (cheapestExpense > spendingList.get(i)) {
        cheapestExpense = spendingList.get(i);
      }
    }
    return cheapestExpense;
  }*/

  public int getGreatestExpense() {
    int greatestExpense = 0;
    for (Integer spending : spendingList) {
      if (greatestExpense < spending) {
        greatestExpense = spending;
      }
    }
    return greatestExpense;
  }
}
//Another solution --> it's good for iterating trough multiple fields/commands/constructors/getters-setters
/*  public int getGreatestExpense2() {
    int greatestExpense = 0;
    for (int i = 0; i < spendingList.size(); i++) {
      if (greatestExpense < spendingList.get(i)) {
        greatestExpense = spendingList.get(i);
      }
    }
    return greatestExpense;
  }*/

