package AbstractsInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

public abstract class Instrument {

  //
  //Fields
  protected String name;

  //
  //Constructors

  public Instrument(String name) {
    this.name = name;
  }

  //
  //Methods
  public abstract void play();

  //
  //Getter and setter

}
