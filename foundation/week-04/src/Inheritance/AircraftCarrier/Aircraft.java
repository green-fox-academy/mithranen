package Inheritance.AircraftCarrier;

import java.util.Collections;

public abstract class Aircraft /*implements Comparable<Aircraft>*/ {

  //fields
  private int maxAmmo;
  private int currentAmmo;   //All aircrafts should be created with an empty ammo storage
  private int baseDamage;
  private String aircraftType;
  private boolean priority; //It's`true` for F35 and `false` for F16

  //Constructor
  public Aircraft(int maxAmmo, int baseDamage, String aircraftType, boolean priority) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.aircraftType = aircraftType;
    this.priority = priority;
    currentAmmo = 0; //this-vel is lehet
  }

  //Methods
  public int fight() {
    int currentDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return currentDamage;
  }

  public int refillAmmo(int carrierAmmo) {
    int missingAmmo = maxAmmo - currentAmmo;
    if (carrierAmmo != 0 && missingAmmo != 0) {// ha van és kell is elég lőszer
      if (carrierAmmo > missingAmmo) {
        currentAmmo = maxAmmo;
        carrierAmmo -= missingAmmo;
      } else {                          //ha kevesebb vagy épp elég lőszer van
        currentAmmo += carrierAmmo;
        carrierAmmo = 0;
      }
    }
    return carrierAmmo;
  }

  public String getStatus() {
    return "Type: " +
        aircraftType + ", " + "Current ammo: " + currentAmmo + ", " + "Base Damage: " + baseDamage
        + ", " + "Current All Damage: " + getCurrentDamage() + "\n";
  }

  public int getCurrentDamage() {
    return currentAmmo * baseDamage;
  }

/*  @Override
  public int compareTo(Aircraft aircraft) {
    int result = Boolean.compare(aircraft.priority, this.priority);
    return result;
  }*/

  //Getters and setters
  public boolean isPriority() {
    return priority;
  }

}



