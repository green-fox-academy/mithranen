package AbstractsInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {

  //
  //Fields

  //
  //Constructors

  public BassGuitar() {
    super("Bass Guitar", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }


  //
  //Methods
  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }

  //
  //Getter and setter
}
