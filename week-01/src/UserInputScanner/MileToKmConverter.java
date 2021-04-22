package UserInputScanner;

import java.util.Scanner;

public class MileToKmConverter {

  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it
    System.out.println("Please, type your number in miles:");
    Scanner userMiles = new Scanner(System.in);
    String userRequestMiles = userMiles.nextLine();
    double doubleUserRequestMiles = Double.valueOf(userRequestMiles).doubleValue();
    System.out.println(doubleUserRequestMiles * 1.61 + " km");
  }
}