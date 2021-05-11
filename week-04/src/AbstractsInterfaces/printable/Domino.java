package AbstractsInterfaces.printable;

public class Domino implements Printable {

  //
  //Fields
  protected int dominoSide1;
  protected int dominoSide2;

  //
  //Constructors
  public Domino(int dominoSide1, int dominoSide2) {
    this.dominoSide1 = dominoSide1;
    this.dominoSide2 = dominoSide2;
  }

  //
  //Methods
  @Override
  public void printAllFields() {
    System.out.println("Domino A side: " + dominoSide1 + ", B side: " + dominoSide2);
  }
  //
  //Getter and setter


}
