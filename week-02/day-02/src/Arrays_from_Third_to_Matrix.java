import java.util.Arrays;

public class Arrays_from_Third_to_Matrix {

  public static void main(String[] args) {

    //----------------------------------------------------

    //1. Third
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print the third element of `numbers`
//    int numbers[] = {4, 5, 6, 7};
    int[] numbers = new int[] {4, 5, 6, 7};
    System.out.println(numbers[2]);

    //----------------------------------------------------

    //2. Compare length
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    int[] firstArrayOfNumbers = new int[] {1, 2, 3};
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    int[] secondArrayOfNumbers = new int[] {4, 5};
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`
    // - Otherwise print: "firstArrayOfNumbers is the longer one"
    if (firstArrayOfNumbers.length < secondArrayOfNumbers.length) {
      System.out.println("secondArrayOfNumbers is longer");
    } else {
      System.out.println("firstArrayOfNumbers is the longer one");
    }

    //------------------------------------------------------

    //3. Sum element
    // - Create an array variable named `numbers`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element
    numbers = new int[] {54, 23, 66, 12};
    System.out.println(numbers[1] + numbers[2]);

    //----------------------------------------------------

    //4. Change  element
    // - Create an array variable named `numbers`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the value of the fourth element (8) to 4
    // - Print the fourth element
    int[] numbers4 = {1, 2, 3, 8, 5, 6};
    numbers4[3] = 4;
    System.out.println(numbers4[3]);

    //----------------------------------------------------

    //5. Increment element
    // Create an array variable named `numbers`
    //  with the following content: `[1, 2, 3, 4, 5]`
    //  Increment the third element
    //  Print the third element
    int[] numbers5 = {1, 2, 3, 4, 5};
    numbers5[2] += 5;
    System.out.println(numbers5[2]);
    //System.out.println(Arrays.toString(numbers5));

    //----------------------------------------------------

    //6. Print elements
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `numbers`
    int[] numbers6 = {4, 5, 6, 7};
    System.out.println(Arrays.toString(numbers6));

    //----------------------------------------------------

    //7. Colors
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`
    String[][] colors =
        {
            {"lime", "forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"},
            {"orchid", "violet", "pink", "hot pink"}
        };

    /*Saját 2. - befejezni, mia hiba?????????

    String[][] colors2 ={}
        colors[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
            colors[1] = new String[] {"orange red", "red", "tomato"};
                {colors[2] = new String[] {"orange red", "red", "tomato"};*/

    /* Gergő 2.
        String[][] colors = {
        new String[] {"lime", "forest green", "olive", "pale green", "spring green"},
        new String[] {"orange red", "red", "tomato"},
        new String[] {"orchid", "violet", "pink", "hot pink"}
    };
    Or Gergő megoldása 1

    String[] greens = {"lime", "forest green", "olive", "pale green", "spring green"};
    String[] reds = {"orange red", "red", "tomato"};
    String[] pinks = {"orchid", "violet", "pink", "hot pink"};
    String[][] colors2 = {greens, reds, pinks};*/

    //----------------------------------------------------

    //8. Matrix
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output
    int[][] matrix = new int[4][4];
    int fill = 1;

    System.out.println();
    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          System.out.print(fill);
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }

      System.out.println("------------------------");//Second solution

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          System.out.print(fill);
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
