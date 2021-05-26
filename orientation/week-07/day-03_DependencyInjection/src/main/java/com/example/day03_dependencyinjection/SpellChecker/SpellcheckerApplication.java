package com.example.day03_dependencyinjection.SpellChecker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellcheckerApplication implements CommandLineRunner {

  //Fields
  private SpellChecker checker;

  //Constructor
  @Autowired
  SpellcheckerApplication(SpellChecker checker) {
    this.checker = checker;
  }

  //Method - main
  public static void main(String[] args) {
    SpringApplication.run(SpellcheckerApplication.class, args);
  }

  //Method - CommandLineRunner
  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
  }

}

