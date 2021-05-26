/*
package com.example.day03_dependencyinjection.helloBeanWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

  //Field
  private Printer printer;

  //Constructor
  @Autowired
  public PrinterApplication(Printer printer) {
    this.printer = printer;
  }

  //Method - main
  public static void main(String[] args) {
    SpringApplication.run(PrinterApplication.class, args);
  }

  //Method - CommandLineRunner
  @Override
  public void run(String... args) throws Exception {
    printer.log("Fantastic");
  }
}
*/
