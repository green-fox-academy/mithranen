package Arrays.homeExercises;

import java.util.Arrays;


public class ArrayExamples {

  public static void main(String[] args) {

    //1.  Primitive and String arrays and sout
    //    IntArray -> TODO to sout Arrays.toSting
    int[] intArray = {4, 5, 6, 7};
    System.out.println(Arrays.toString(intArray));
    System.out.println(intArray[2]);

    System.out.println("----------------------------------");
    System.out.println();

    //    StringArray -> TODO to sout Arrays.toString
    String[] stringArray = new String[]{"3", "kiskutya", "kiscica", "@", "/"};
    System.out.println(Arrays.toString(stringArray));
    System.out.println(stringArray[3]);

    System.out.println("----------------------------------");
    System.out.println();

    //    CharArray -> TODO to sout just simply sout!!!
    char[] charArray = {'b', ' ', 'b', ' ', '&', ' ', '+' };
    System.out.println(charArray);
    System.out.println(charArray[2]);

    System.out.println("----------------------------------");
    System.out.println();

    //Primitive arrays elements with loops
    for (int i = 0; i < intArray.length; i++) {
      System.out.println("Int element of intArray at index " + i + " : " + intArray[i]);
    }

    // TODO arrays.length from first to end; but last value's index is lenght-1!!!!!!!!!!!!!!!!4
    System.out.println(intArray.length);

    //TODO intArray and its clone sout!!
    System.out.println(Arrays.toString(intArray));
    int[] intClone = intArray.clone();
    System.out.println(Arrays.toString(intClone));

    //2.  Arrays of Object and sout TODO nem nagyon van értelme az Objectum tömbnek!!
    Student[] objectArray = new Student[3];


  }

  private static class Student {
  //TODO EZT ÍGY NEM NAGYON LEHET EGY CLASSBAN másik INNERCLASS most csak a példa!!!!!
  }
}
