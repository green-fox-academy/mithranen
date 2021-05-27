package com.example.day03_dependencyinjection.UsefulUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

  private List<String> colors;
  private Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String getAlertStyle(String inputEmail) {
    if (!inputEmail.contains("@") && !inputEmail.contains(".")) {
      return "red";
    }
    return "green";
  }

  public String validateEmail(String inputEmail) {
    if (!inputEmail.contains("@") && !inputEmail.contains(".")) {
      return inputEmail + " is not a valid email address!";
    }
    return inputEmail + " is a valid email address!";
  }

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}
