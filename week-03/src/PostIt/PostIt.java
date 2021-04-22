package PostIt;

public class PostIt {

  /*  Create a PostIt.PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
        Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/
  private String backgroundColor;
  private String textColor;
  private String text;

  public PostIt(String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;
  }

  //pirnot all data from one postIt,
  // !!!!44444444444 nem szükséges a "this.", mert nincs bejövő input,
  public void printPostIt (){
    System.out.println(this.backgroundColor + " " + this.textColor + " " + this.text);
  }

  //set- felülírás //inputja van, nincs retunr
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public void setText(String text) {
    this.text = text;
  }

  //get- olvasát/kiolvasás, nincs paramétrer(jisz olvasunk), van return, hisz vémit ki kell olvasni
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public String getTextColor() {
    this.textColor = textColor;
    return textColor;
  }

  public String getText() {
    this.text = text;
    return text;
  }
}