package AbstractsInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {

  //
  //Fields
  protected int numberOfStrings;

  //
  //Constructors


  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  //
  //Methods
  @Override
  public void play() {
    System.out.print(name + ", a " + numberOfStrings + "-stringed instrument that goes ");
    sound();
  }

  public abstract void sound();
  //
  //Getter and setter

}
