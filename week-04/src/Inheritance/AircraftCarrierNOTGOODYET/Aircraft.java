package Inheritance.AircraftCarrierNOTGOODYET;

public abstract class Aircraft {

  //fields
  private int maxAmmo;
  private int currentAmmo;   //All aircrafts should be created with an empty ammo storage
  private int baseDamage;
  private int currentDamage; //It's`true` for F35 and `false` for F16
  private String aircraftType;
  private boolean Priority;

  //Constructor
  public Aircraft(int maxAmmo, int baseDamage, String aircraftType, boolean priority) {
    this.maxAmmo = maxAmmo;
    currentAmmo = 0; //this-vel is lehet
    this.baseDamage = baseDamage;
    currentDamage = 0; //this-vel is lehet
    this.aircraftType = aircraftType;
    this.Priority = priority;
  }

  //Methods
  public int fight() {
    currentDamage = maxAmmo * baseDamage;
    currentAmmo = 0;
    return currentDamage;
  }

  public int refillAmmo(int ammo) {
    int missingAmmo = maxAmmo - currentAmmo;
    if (ammo != 0 && missingAmmo != 0) {// ha van és kell is elég lőszer
      if (ammo > missingAmmo) {
        currentAmmo = maxAmmo;
        ammo -= missingAmmo;
      } else {                          //ha kevesebb vagy épp elég lőszer van
        currentAmmo += ammo;
        ammo = 0;
      }
    }
    return ammo;
  }

  public String getType(String aircraftType) {
    return aircraftType;
  }

  public String getStatus() {
    String status = "Type: " +
        aircraftType + ", " + "Current ammo: " + currentAmmo + ", " + "Base Damage: " + baseDamage
        + ", " + "Current All Damage: " + baseDamage * currentAmmo;
    return status;
  }

  public boolean isPriority() {
    return Priority;
  }

  //Getter and setter

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getCurrentDamage() {
    return currentDamage;
  }

  public void setCurrentDamage(int currentDamage) {
    this.currentDamage = currentDamage;
  }

  public String getAircraftType() {
    return aircraftType;
  }

  public void setAircraftType(String aircraftType) {
    this.aircraftType = aircraftType;
  }

  public void setPriority(boolean priority) {
    Priority = priority;
  }
}



