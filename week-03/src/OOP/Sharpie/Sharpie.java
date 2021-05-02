package OOP.Sharpie;

/*
Create a OOP.Sharpie class
We should know the followings about each sharpie:
    color (which should be a string),
    width (which will be a floating point number) and the
    inkAmount (another floating point number)
    We need to specify the color and the width at creation
    Every sharpie is created with a default inkAmount value: 100
    We can use() the sharpie objects: using it decreases inkAmount by 10*/
public class Sharpie {

  private String color;
  private double width;
  private double inkAmount;

  Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount-=10;
  }
}
