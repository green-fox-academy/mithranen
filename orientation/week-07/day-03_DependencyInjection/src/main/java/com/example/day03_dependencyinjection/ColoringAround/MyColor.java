package com.example.day03_dependencyinjection.ColoringAround;

import com.example.day03_dependencyinjection.helloBeanWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
public interface MyColor {

  public String printColor();
}
