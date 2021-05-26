package com.example.day03_dependencyinjection.helloBeanWorld;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class Printer {

  //
//  public Printer() {
//  }

  //Method
  public void log(String message) {
    System.out.println(LocalDateTime.now() + " A PRINTER AZT MONDJA --- " + message);
  }
}

