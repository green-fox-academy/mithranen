package com.gfa.winnieandthepooh.controllers;

import com.gfa.winnieandthepooh.dtos.InputCreatorAnimalDTO;
import com.gfa.winnieandthepooh.dtos.InputModifierAnimalDTO;
import com.gfa.winnieandthepooh.models.Animal;
import com.gfa.winnieandthepooh.models.Gender;
import com.gfa.winnieandthepooh.services.MainService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private final MainService mainService;

  @Autowired
  public MainRestController(MainService mainService) {
    this.mainService = mainService;
  }

  //Create animal with new name and age
  @RequestMapping(path = "/inhabitant", method = RequestMethod.POST)
  public ResponseEntity<?> createNewAnimal(
      @RequestBody(required = false) InputCreatorAnimalDTO inputlDTO,
      @RequestParam(required = false) String name) {
    if (inputlDTO == null
        || inputlDTO.getNewAge() == null
        || inputlDTO.getGender() == null
        || name == null
        || name.equals("")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("Give full input (name and age and gender too!!!) to create new animal!");
    }
    return ResponseEntity.status(HttpStatus.OK)
        .body(mainService.createNewAnimalByJSON(inputlDTO, name));
  }

  //TODO stackoverflow?????????? - táblázat,  GENDER enumról (ordinate) --> MySql-ben 0 és 1 !!!!!!!!
  //UPDATE given ID with new name and age
  @RequestMapping(path = "/inhabitant", method = RequestMethod.PUT)
  public ResponseEntity<?> updateAnimalById(
      @RequestBody(required = false) InputModifierAnimalDTO inputModifierAnimalDTO,
      @RequestParam(required = false) Long id) {
    if (id == null
        || inputModifierAnimalDTO == null
        || inputModifierAnimalDTO.getNewAge() == null
        || inputModifierAnimalDTO.getNewName() == null
        || inputModifierAnimalDTO.getNewName().equals("")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("Give full input: name and age too!");
    } else if (!mainService.existById(id)) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND)
          .body("No existing target with the given Id!");
    }
    return ResponseEntity.status(HttpStatus.NO_CONTENT)
        .body(mainService.updateAnimal(inputModifierAnimalDTO, id));
  }

  //GET (Read) gender list by given query string - JSON format
  @RequestMapping(path = "/list", method = RequestMethod.GET)
  public ResponseEntity<?> getAllAnimalByGender(@RequestParam Gender gender) {
    if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
      List<Animal> filteredListByGender = StreamSupport
          .stream(mainService.getAllAnimal().spliterator(), false)
          .filter(animal -> animal.getGender().equals(gender))
          .collect(Collectors.toList());
      return ResponseEntity.status(HttpStatus.OK).body(filteredListByGender);
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
  }
}

//Solution 2 - instead of StreamSupport
/*
    if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
        for (Animal animal : mainService.getAllAnimal()) {
        if (animal.getGender().equals(gender)) {
        filteredListByGender.add(animal);
        }
        }
        return ResponseEntity.status(HttpStatus.OK).body(filteredListByGender);
        }*/
