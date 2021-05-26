package com.example.day03_dependencyinjection.SpellChecker;

import org.springframework.stereotype.Service;

@Service
public class SpellChecker {

  //Constructor
  public SpellChecker() {
    System.out.println("A SpellChecker konstruktorában.");
  }

  //Method
  public void checkSpelling() {
    System.out.println("A checkSpelling függvényben.");
  }
}
