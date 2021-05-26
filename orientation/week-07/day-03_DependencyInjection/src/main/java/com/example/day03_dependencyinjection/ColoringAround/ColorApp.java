package com.example.day03_dependencyinjection.ColoringAround;

//There is one interface given:
//
//public interface MyColor {
//  public void printColor();
//}
//  !Any kind of color class (i.e. RedColor) can implement this interface overriding printColor();
//  sout-ing for i.e. "It is red in color...".
//
//    !Implement the interface multiple times for different colors
//    !Annotate one of them with @Service and autowire the interface in the application and use the printColor() method
//    !Move the annotation to another implementation
//    Change the implementations of the printColor() method to use the Printer service with autowiring (instead of sout-ing)

import com.example.day03_dependencyinjection.helloBeanWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.day03_dependencyinjection.helloBeanWorld",
    "com.example.day03_dependencyinjection.ColoringAround"})
// egy mappával feljebb keresi
@Configuration
public class ColorApp implements CommandLineRunner {
//kiváltja a kontroller klassts commandlinerunner-t

  //Fields
  private MyColor color;
  private Printer printer;

  //Constructor
  @Autowired
  public ColorApp(@Qualifier("red") MyColor color, Printer printer) {
    this.color = color;
    this.printer = printer;
  }

  //Method - main
  public static void main(String[] args) {
    SpringApplication.run(ColorApp.class, args);
  }

  //Method - CommandLineRunner
  @Override
  public void run(String... args) throws Exception {
    printer.log(color.printColor());
  }
}
