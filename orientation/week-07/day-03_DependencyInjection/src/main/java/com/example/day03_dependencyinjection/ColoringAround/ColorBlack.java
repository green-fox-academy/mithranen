package com.example.day03_dependencyinjection.ColoringAround;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("black")
public class ColorBlack implements MyColor {

  @Override
  public String printColor() {
    return "It is Black in color...";
  }
}
