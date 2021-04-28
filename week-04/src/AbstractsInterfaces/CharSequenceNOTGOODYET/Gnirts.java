package AbstractsInterfaces.CharSequenceNOTGOODYET;

public class Gnirts implements java.lang.CharSequence {

  protected String toReverse;

  public Gnirts(String toReverse) {
    this.toReverse = toReverse;
    StringBuilder sb = new StringBuilder();
    this.toReverse = sb.append(toReverse).reverse().toString();
  }


  @Override
  public int length() {
    return toReverse.length();
  }

  @Override
  public char charAt(int index) {
    return toReverse.charAt(index);
  }

  @Override
  public java.lang.CharSequence subSequence(int start, int end) {
    return toReverse.subSequence(start, end);
  }
}
