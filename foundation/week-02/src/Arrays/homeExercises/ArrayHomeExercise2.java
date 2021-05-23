package Arrays.homeExercises;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayHomeExercise2 {
/*   int randomArray[];
    randomArray = new int[20];
    randomArray[1] = 2;
    String stringArray[] = {"just", "random", "words" };*/

  public static void main(String[] args) {

    // a random array for examples
    int[] numberArray = new int[10];

    // loop [0...9]
    for (
        int i = 0;
        i < numberArray.length; i++) {
      numberArray[i] = i;
    }
    System.out.println(Arrays.toString(numberArray));//why?? arrays.toString etc...

    // loop "-"
    int k = 1;
    while (k <= 41) {
      System.out.print('-');
      k++;
    }
    System.out.println(); //why empty?

//    loop |0 |1 ....|9 |
    for (
        int j = 0;
        j < numberArray.length; j++) {
      System.out.print("| " + j + " ");
    }
    System.out.println("|");

    // multi-dimensional array
    String[][] multiArray = new String[10][10];
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        multiArray[i][j] = i + " " + j;
      }
    }
    k = 1;
    while (k <= 61) {
      System.out.print('-');
      k++;
    }
    System.out.println();

    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.print("| " + multiArray[i][j] + " ");
      }
      System.out.println("|");
    }
    k = 1;
    while (k <= 61) {
      System.out.print('-');
      k++;
    }
    System.out.println();

    for (int row : numberArray) {
      System.out.print(row);
    }
    System.out.println("\n");

    //enhanced multi-dimensional array
    for (String[] rows : multiArray) {
      for (String column : rows) {
        System.out.print("| " + column + " ");
      }
      System.out.println("|");
    }

/*    //enhanced advanced for (????????????????????????????????)
    for(dataType[] varForRow: multiArray){
      for(dataType[] varForColumn: multiArray){
      }*/

    //copy data from arrays/copy arrays
    int[] numberCopy = Arrays.copyOf(numberArray, 5);
    for (int row : numberCopy) {
      System.out.print(row);
    }
    System.out.println("\n");

    //Arrays specific data copy Arrays.copyRange metódus ,
    //Arrays.copyOfRange(numberArray, 3, 6);//????????

    //Arrays.toString metódus
    System.out.println(Arrays.toString(numberCopy));

    //Array.fill?????????
    int[] moreNumbers = new int[100];
    Arrays.fill(moreNumbers, 2);

    char[][] boardGame = new char[10][10];
    for (char[] row : boardGame) {
      Arrays.fill(row, '*');
    }
    //Sort array - Arrays.sort
    int[] numsToSort = new int[10];
    for (int i = 0; i < 10; i++) {
      numsToSort[i] = (int) (Math.random() * 100);
    }
    Arrays.sort(numsToSort);
    System.out.println(Arrays.toString(numsToSort));

    // Binary search
    int whereIs50 = Arrays.binarySearch(numsToSort, 50);
    System.out.println(whereIs50);
  }
}

