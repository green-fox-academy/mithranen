package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {

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
  }
}
