package com.example.day03_dependencyinjection.ColoringAround;

import com.example.day03_dependencyinjection.helloBeanWorld.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class ColorRed implements MyColor {

  @Override
  public String printColor() {
    return "It is RED in color...";
  }
}
