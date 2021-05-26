package com.example.day03_dependencyinjection.ColoringAround;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class ColorGreen implements MyColor {

  @Override
  public String printColor() {
    return "It is GREEN in color...";
  }
}
