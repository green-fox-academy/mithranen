package Animal;

public class Main {

  public static void main(String[] args) {
    Animal lion = new Animal();
    Animal zebra = new Animal();
    Animal elephant = new Animal();


    System.out.println(lion.getHunger());
    System.out.println(lion.getThirst());
    lion.eating();
    lion.drinking();
    System.out.println(lion.getHunger());
    System.out.println(lion.getThirst());
  }
}
