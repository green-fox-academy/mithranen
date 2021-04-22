package SharpieSets;

/*
Create a Sharpie class
We should know the followings about each sharpie:
    color (which should be a string),
    width (which will be a floating point number) and the
    inkAmount (another floating point number)
    We need to specify the color and the width at creation
    Every sharpie is created with a default inkAmount value: 100
    We can use() the sharpie objects: using it decreases inkAmount by 10*/
public class SharpieReUse {

  private String color;
  private double width;
  private double inkAmount;

  public SharpieReUse(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount -= 10;
  }

  //setters are unnecessary!!
  //Color setter/getter
  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  //Width setter/getter
  public void setWidth(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }//amountInk setter/getter

  public void setInkAmount(double width) {
    this.inkAmount = inkAmount;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  //függvény visszatérési értéke, amelyben stringként van összefűzve az ink, width, color!!!
  public void showValuesOfSharpie(){
    System.out.println(color + ", " + width + ", " + inkAmount);
  }

  /*public String showValuesOfSharpie() {
    String oneSharpie = color + ", " + width + ", " + inkAmount;
    return oneSharpie;
  }*/
}
