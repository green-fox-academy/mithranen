package AbstractsInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

  //
  //Fields


  //
  //Constructors
  public ElectricGuitar() {
    super("Electric Guitar", 6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super("Electric Guitar", numberOfStrings);
  }

  //
  //Methods
  @Override
  public void sound() {
    if (numberOfStrings <= 6) {
      System.out.println("Twang");
    } else {
      System.out.println("Twangg");
    }

  }

  //
  //Getter and setter

}
