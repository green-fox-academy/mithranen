package pirate;

import java.security.PublicKey;
import javax.naming.Name;

public class Captain extends Pirate {

  //
  //Fields
//  mindet örökölte

  //
  //Constructors
  public Captain(String name, boolean woodLeg) {
    super(name, woodLeg);
  }

  public Captain(String name, boolean woodLeg, int amountGold) {
    super(name, woodLeg, amountGold);
  }

  //
  //Methods
  //  work() which increases the amount of gold possessed
  //  by that pirate by 10 and decrease the HP by 5.
  //  party() which increases the HP by 10.*/
  @Override
  public void work() {
    this.amountGold += 10;
    this.healthPoints -= 5;
  }

  @Override
  public void party() {
    this.healthPoints += 10;
  }

  //
  //Getter and setter

}
