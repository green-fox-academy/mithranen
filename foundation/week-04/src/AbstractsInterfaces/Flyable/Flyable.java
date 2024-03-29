package AbstractsInterfaces.Flyable;
/*Create a Flyable interface
it should have land, fly and takeOff methods (TakeOff in C#)
    Create an abstract Vehicle class
it should have at least 3 fields
    Extend Helicopter class from Vehicle
    implement your Flyable interface
Extend Bird from your abstract Animal class (zoo exercise)
    implement your Flyable interface*/

public interface Flyable {

  abstract void land();
  abstract void fly();
  abstract void takeOff();

}
