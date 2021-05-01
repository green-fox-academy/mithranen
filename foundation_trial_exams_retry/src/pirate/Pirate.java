package pirate;

public class Pirate {

  //
  //Fields
  private String name;
  protected int amountGold;
  protected int healthPoints;
  protected boolean woodLeg;

  //
  //Constructors
  public Pirate(String name, boolean woodLeg) {
    this.name = name;
    this.amountGold = 10; //TODO maybe just HP???
    this.healthPoints = 10;
    this.woodLeg = woodLeg;
  }

  public Pirate(String name, boolean woodLeg, int amountGold) {
    this.name = name;
    this.amountGold = amountGold;
    this.woodLeg = woodLeg;
    healthPoints = 10;
  }

  //
  //Methods
//  work() which increases the amount of gold by 1 and decreases the HP by 1.
//  party() which increases the HP by 1.
  public void work() {
    this.amountGold += 1;
    this.healthPoints -= 1;
  }

  public void party() {
    this.healthPoints += 1;
  }

  public String pirateAllStat() {
    return "Name: " + name + ", Gold: " + amountGold + ", HP: " + healthPoints + ", Has woodleg?: "
        + woodLeg + "\n";
  }

  @Override
  public String toString() {
    String introductionText;
    if (woodLeg) {
      introductionText =
          "Hello, I'm " + name + " I have a wooden leg and " + amountGold
              + " golds.";
    } else {
      introductionText = "Hello, I'm " + name + " I still have my real legs and " +
          amountGold + " golds.";
    }
    return introductionText;
  }

  //
  //Getter and setter

  public String getName() {
    return name;
  }
}
