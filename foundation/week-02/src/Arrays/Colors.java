package Arrays;

public class Colors {

  public static void main(String[] args) {
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
  }
}
