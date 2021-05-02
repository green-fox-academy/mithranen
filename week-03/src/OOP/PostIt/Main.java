package OOP.PostIt;

public class Main {

  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "blue ", "Idea 1");
    PostIt postIt2 = new PostIt("pink", "black", "Awesome");
    PostIt postIt3 = new PostIt("yellow", "green", "Superb");

    //System.out.println(postIt1.backgroundColor + "" + postIt1.backgroundColor);
    postIt1.setBackgroundColor("grey");
    System.out.println(postIt1.getBackgroundColor());
    System.out.println(postIt2.getText());
    System.out.println(postIt3.getTextColor());
    System.out.println("------------\n");
    postIt1.printPostIt();
    postIt2.printPostIt();
    postIt3.printPostIt();
  }
}
