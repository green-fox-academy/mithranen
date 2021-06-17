package com.gfa.winnieandthepooh.controllers;

import com.gfa.winnieandthepooh.models.Animal;
import com.gfa.winnieandthepooh.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class MainController {

  private final MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @RequestMapping(path = {"/"}, method = RequestMethod.GET)
  public String displayMainPage() {
    return "main";
  }

  //Read all animal
  @RequestMapping(path = {"/inhabitants"}, method = RequestMethod.GET)
  public String displayAnimals(Model model) {
    model.addAttribute("animals", mainService.getAllAnimal());
    return "inhabitants";
  }

  //Show (Read) to inhabitant details, + nums/color/rooms'num of houeses
  @RequestMapping(path = {"/inhabitant/{id}"}, method = RequestMethod.GET)
  public String showAnimalDetailsPage(Model model, @PathVariable Long id) {
    Animal storedAnimalById = mainService.getAnimalById(id);
    if (mainService.checkAnimalAgeIfUnder4(storedAnimalById)){
      model.addAttribute("isBabyAnimal", true);
    }
    model.addAttribute("animal", storedAnimalById);
    model.addAttribute("numberOfHouses", mainService.getNumberOfHouses(storedAnimalById));
    model.addAttribute("numberOfRooms", mainService.getAllRoomsAmount(storedAnimalById));
    model.addAttribute("colorsOfHouses", mainService.getColorsOfHouses(storedAnimalById));
    return "inhabitant";
  }

  //Search by name
  @RequestMapping(path = {"/search"}, method = RequestMethod.GET)
  public String searchByNameAndDisplaytDetailsPage(@RequestParam String searchedName,
      RedirectAttributes attributes) {
    if (!mainService.existByName(searchedName)) {
      attributes.addFlashAttribute("searchedName", searchedName);
      return "redirect:/inhabitant/0";
    }
    Long id = mainService.getAnimalByName(searchedName).getId();
    return "redirect:/inhabitant/" + id;
  }

  //Creat new animal
  @RequestMapping(path = {"/inhabitant/add"}, method = RequestMethod.GET)
  public String getAddNewInhabitantPage(Model model) {
    model.addAttribute("animal", mainService.getEmptyAnimal());
    return "add-new";
  }

  @RequestMapping(path = {"/inhabitant/add"}, method = RequestMethod.POST)
  public String createNewInhabitant(@ModelAttribute Animal animal) {
    mainService.createNewAnimalInHTML(animal);
    return "redirect:/";
  }
}
