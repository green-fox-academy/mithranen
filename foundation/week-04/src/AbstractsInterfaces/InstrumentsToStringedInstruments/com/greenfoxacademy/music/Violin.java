package AbstractsInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
  //
  //Fields

  //
  //Constructors

  public Violin() {
    super("Violin", 4);
  }

  public Violin(int numberOfStrings) {
    super("Violin", numberOfStrings);
  }


  //
  //Methods
  @Override
  public void sound() {
    System.out.println("Screech");
  }

  //
  //Getter and setter
}
