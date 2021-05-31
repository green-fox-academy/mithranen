package com.gfa.day01_springsql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosH2Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosH2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
