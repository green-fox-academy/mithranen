import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

 /* public static void main(String[] args) {
    ArrayList<Integer> grades = new ArrayList<>();
    grades.add(90);
    grades.add(85);
    grades.add(70);
    for (int i = 0; i < grades.size(); i++) { //grades.size - how many elements in the
      System.out.printf("Grades #%d  == %d\n  ", i, grades.get(i)); //array: grades[i] vs
      // collection:grades.get(i)
    }
    grades.remove(1);
    System.out.println(grades);
  }*/

public class ArrayListExerciseHome {

  //Derek Banas video...
  public static void main(String[] args) {
    ArrayList arrayListOne;
    arrayListOne = new ArrayList();
    ArrayList arrayListTwo = new ArrayList();
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Johny");
    names.add("Joe");

    names.add(2, "Jack Ryan");
    names.set(0, "Rachel");
    names.remove(3);
    //names.removeRange(0, 1); protected!!!!!!

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
    System.out.println(names);
    //enhanced for loop!!!!!!
    for (String i : names) {
      System.out.println(i);
    }
    //Iterator object
    /*Iterator individualsItems = names.iterator();
    while (individualsItems.hasNext()) {
      System.out.println(individualsItems.hasNext());//infinite loop....
    }*/

    //Arraylist without giving the type of data - ????? surely????
    ArrayList nameCopy = new ArrayList();
    ArrayList nameBackUp = new ArrayList();

    nameCopy.addAll(names);
    System.out.println(names);
    //ArrayList creating without values 2;
    String paulYoung = "Paul Young";
    names.add(paulYoung);
    if (names.contains(paulYoung)) {
      System.out.println("Paul is here");
    }
    //.containsAll
    if (names.containsAll(nameCopy)) {
      System.out.println("Everything in nameCopy is in names");
    }//Copied names to nameCopy
    //Added to names
    System.out.println(nameCopy);
    //.clear
    names.clear();
    if (names.isEmpty()) {
      System.out.println("Array is empty");
    }
    //.toArray - hozzáad moreNames-hez Arrayt
    Object[] moreNames = new Object[4];
    moreNames = nameCopy.toArray();
    System.out.println(Arrays.toString(moreNames));
  }
}

