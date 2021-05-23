package Inheritance.AircraftCarrier;

public class Main {

  public static void main(String[] args) {
    Carrier USSWashington = new Carrier(300, 1500);
    Carrier USSEnterprise = new Carrier(200, 2000);

    Aircraft F16_123 = new F16();
    Aircraft F16_15 = new F16();
    Aircraft F16_47 = new F16();
    Aircraft F35_11 = new F35();

    System.out.println(USSWashington.getStatus());

    USSWashington.add(F16_123);
    USSWashington.add(F16_15);
    USSWashington.add(F35_11);
    USSWashington.add(F16_47);
    System.out.println(USSWashington.getStatus());

    USSWashington.fill();

    System.out.println(USSWashington.getStatus());

    F16_15.fight();
    F16_15.refillAmmo(23562346);
    System.out.println(F16_15.getStatus());

    System.out.println(USSWashington.getStatus());

    Aircraft F35_34 = new F35();
    Aircraft F35_7 = new F35();
    Aircraft F35_102 = new F35();
    USSEnterprise.add(F35_34);
    USSEnterprise.add(F35_7);
    USSEnterprise.add(F35_102);

    System.out.println("*************************************-");
    USSWashington.fill();
    System.out.println(USSEnterprise.getStatus());
    USSWashington.fight(USSEnterprise);
    System.out.println(USSEnterprise.getStatus());

  }
}
