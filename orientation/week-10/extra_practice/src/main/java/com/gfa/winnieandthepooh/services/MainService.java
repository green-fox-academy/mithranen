package com.gfa.winnieandthepooh.services;

import com.gfa.winnieandthepooh.dtos.InputCreatorAnimalDTO;
import com.gfa.winnieandthepooh.dtos.InputModifierAnimalDTO;
import com.gfa.winnieandthepooh.models.Animal;
import com.gfa.winnieandthepooh.models.House;
import com.gfa.winnieandthepooh.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private final AnimalRepository animalRepository;

  @Autowired
  public MainService(AnimalRepository animalRepository) {
    this.animalRepository = animalRepository;
  }

  //Create new animal HTML
  public Animal getEmptyAnimal() {
    return new Animal();
  }

  public void createNewAnimalInHTML(Animal newAnimal) {
    newAnimal.setName(setAnimalName(newAnimal.getName(), newAnimal.getAge()));
    animalRepository.save(newAnimal);
  }

  //Create new animal from JSON
  public Animal createNewAnimalByJSON(InputCreatorAnimalDTO inpudDTO, String name) {
    Animal newAnimal = getEmptyAnimal();
    newAnimal.setName(setAnimalName(name, inpudDTO.getNewAge()));
    newAnimal.setGender(inpudDTO.getGender());
    animalRepository.save(newAnimal);
    return newAnimal;
  }

  //Read all animal
  public Iterable<Animal> getAllAnimal() {
    return animalRepository.findAll();
  }

  //Read animal by ID
  public Animal getAnimalById(Long id) {
    return animalRepository.findById(id).orElse(null);
  }

  //Read animal by Name
  public Animal getAnimalByName(String searchedName) {
    return animalRepository.findByName(searchedName);
  }

  //Update animal with new Name and age
  public Animal updateAnimal(InputModifierAnimalDTO inputModifierAnimalDTO, Long id) {
    Animal updatableAnimal = getAnimalById(id);
    //updatableAnimal.setName(inputAnimalDTO.getNewName());
    updatableAnimal.setId(id);

    //TODO task say: The age shall only be modified if the send information is > 10!!!!
    //Now if DTO age > 4
    if (inputModifierAnimalDTO.getNewAge() >= 5) {
      updatableAnimal.setAge(inputModifierAnimalDTO.getNewAge());
      updatableAnimal
          .setName(setAnimalName(inputModifierAnimalDTO.getNewName(),
              inputModifierAnimalDTO.getNewAge()));
    }
/*    if (updatableAnimal.getAge() <= 4) {
      updatableAnimal
          .setName(setAnimalName(inputAnimalDTO.getNewName(), inputAnimalDTO.getNewAge()));
    }*/
    return animalRepository.save(updatableAnimal);
  }

  //Exists animal with given Name
  public boolean existByName(String searchedName) {
    return animalRepository.existsByName(searchedName);
  }

  //Exists animal with given Id
  public boolean existById(Long id) {
    return animalRepository.existsById(id);
  }

  //If animal under age 4
  public boolean checkAnimalAgeIfUnder4(Animal animal) {
    return animal.getAge() <= 4;
  }

  //Set animal name with +"ka", if age =<4
  private String setAnimalName(String name, int age) {
    if (age <= 4) {
      return name + "ka";
    }
    return name;
  }

//  ********************************************************

  //Get number of houses of Animal
  public int getNumberOfHouses(Animal animal) {
    int temp = validateHouseSizeIfAnimalNotExist(animal);
    if (temp == 0) {
      return 0;
    }
    return animal.getHousesOfAnimal().size();
  }

  //Get number of room of houses of Animal
  public int getAllRoomsAmount(Animal animal) {
    int temp = validateHouseSizeIfAnimalNotExist(animal);
    if (temp == 0) {
      return 0;
    }

    int allRooms = 0;
    for (int i = 0; i < animal.getHousesOfAnimal().size(); i++) {
      allRooms += animal.getHousesOfAnimal().get(i).getNumberOfRooms();
    }
    return allRooms;
  }

  //Get color of houses of Animal
  public String getColorsOfHouses(Animal animal) {
    int temp = validateHouseSizeIfAnimalNotExist(animal);
    if (temp == 0) {
      return "";
    }
    StringBuilder stringBuilder = new StringBuilder();
    int numberOfHouses = getNumberOfHouses(animal);

    for (int i = 0; i < numberOfHouses; i++) {

      House actualHouse = animal.getHousesOfAnimal().get(i);

      if (i == numberOfHouses - 1) {
        stringBuilder.append(actualHouse.getColor());
      } else if (i == numberOfHouses - 2) {
        stringBuilder.append(actualHouse.getColor()).append(" and ");
      } else {
        stringBuilder.append(animal.getHousesOfAnimal().get(i).getColor()).append(", ");
      }
    }
    return stringBuilder.toString();
  }

  private int validateHouseSizeIfAnimalNotExist(Animal animal) {
    if (animal == null || animal.getHousesOfAnimal() == null || animal.getHousesOfAnimal()
        .isEmpty()) {
      return 0;
    }
    return animal.getHousesOfAnimal().size();
  }
}
