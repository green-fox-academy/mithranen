package com.gfa.winnieandthepooh;

import com.gfa.winnieandthepooh.models.Animal;
import com.gfa.winnieandthepooh.models.Gender;
import com.gfa.winnieandthepooh.models.House;
import com.gfa.winnieandthepooh.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinnieAndThePoohApplication implements CommandLineRunner {

  private final AnimalRepository animalRepository;

  @Autowired
  public WinnieAndThePoohApplication(
      AnimalRepository animalRepository) {
    this.animalRepository = animalRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(WinnieAndThePoohApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Animal micimackó = new Animal("Micimackó", 5, Gender.MALE);
    Animal malacka = new Animal("Malacka", 3, Gender.FEMALE);

    House house1 = new House("Mackó-lak", "brown", 3);
    House house2 = new House("Egy jó hely", "brown", 5);
    House house3 = new House("Malac-ól", "white", 3);
    House house4 = new House("Kiskert Ház", "yellow", 2);
    House house5 = new House("Verem", "black", 1);

    micimackó.addHouse(house1);
    micimackó.addHouse(house2);

    malacka.addHouse(house3);
    malacka.addHouse(house4);
    malacka.addHouse(house5);

    animalRepository.save(micimackó);
    animalRepository.save(malacka);

  }
}
