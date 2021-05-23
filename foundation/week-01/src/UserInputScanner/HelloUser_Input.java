package UserInputScanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloUser_Input {

  public static void main(String[] args) {
    // Modify this program to greet the User instead of the World!
    // The program should ask for the name of the User
    System.out.println("Hello, what is your name?!");
    Scanner userName = new Scanner(System.in);
    String userInput = userName.nextLine();
    System.out.println("Hello " + userInput +"!");
  }
}