import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class PartyIndicator {

  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second represents the number of boys
    int girls;
    int boys;
    Scanner input = new Scanner(System.in);
    System.out.println("How many girls are in the party:");
    girls = input.nextInt();
    System.out.println("How many boys are in the party:");
    boys = input.nextInt();
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // it should print: The party is excellent!
    if ((girls == boys) && (girls + boys >= 20)) {
      System.out.println("The party is excellent!");
    }
    //
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // it should print: Quite a cool party!
    else if ((girls != boys) && (girls + boys >= 20) && (girls !=0)) {
      System.out.println("Quite a cool party!");
    }
    //
    // If there are less people coming than 20
    // it should print: Average party...
    else if ((girls + boys < 20) && girls !=0) {
      System.out.println("Average party...");
    }
    //
    // If no girls are coming, regardless the count of the people
    // it should print: Sausage party
    else if (girls==0){
      System.out.println("Sausage party");}
  }
}