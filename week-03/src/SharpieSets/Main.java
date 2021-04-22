package SharpieSets;

public class Main {

  public static void main(String[] args) {

    SharpieSet sharpieList = new SharpieSet();
    sharpieList.add(new SharpieReUse("black", 8));
    SharpieReUse sharpie = new SharpieReUse("pink", 7);
    sharpieList.add(sharpie);

    System.out.println(sharpieList.countUsable());
    System.out.println("----------------------");

    //red Sharpie used 10x, empty
    for (int i = 0; i < 10; i++) {
      sharpieList.getSharpieSet().get(0).use();
    }

    //blue Sharpie used 10x, empty
    for (int i = 0; i < 10; i++) {
      sharpieList.getSharpieSet().get(3).use();
    }

    //? Sharpie used 10x, empty
    for (int i = 0; i < 10; i++) {
      sharpieList.getSharpieSet().get(2).use();
    }

    // how many usable Sharpie do I have now?
    System.out.println(sharpieList.countUsable());
    System.out.println("---------------");

    //Delete one sharpie
//sharpieList.removeTrash();
    sharpieList.removeTrash();

    System.out.println(sharpieList.countUsable());
    System.out.println("------------------");

    //Show one sharpie
    sharpieList.allCurrentSharpie();
  }
}
