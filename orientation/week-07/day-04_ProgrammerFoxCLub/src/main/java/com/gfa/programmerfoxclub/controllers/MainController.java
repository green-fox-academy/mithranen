package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.modules.Drink;
import com.gfa.programmerfoxclub.modules.Food;
import com.gfa.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


  //Fields
  private String loggedFoxName;
  private FoxService foxservice;

  @Autowired
  //Constructors
  public MainController(FoxService foxservice) {
    this.foxservice = foxservice;
    this.loggedFoxName = "Mr. Fox";
  }

  //Methods - endpoints
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String getHome(Model model,
      @RequestParam(defaultValue = "Mr. Fox", required = false) String foxName) {
    model.addAttribute("loggedFox", foxservice.findFoxByName(loggedFoxName));
    model.addAttribute("fox", foxservice.findFoxByName(foxName));
    model.addAttribute("loggedFoxName", loggedFoxName);
    return "index";
  }

  @RequestMapping(path = "/login", method = RequestMethod.GET)
  public String getLoginPage() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String getFox(Model model, @RequestParam String foxName) {
    model.addAttribute("foxName", foxName);
    foxservice.findFoxByName(foxName);
    loggedFoxName = foxName;
    return "redirect:/?foxName=" + foxName;
  }

  @RequestMapping(path = "/nutrition-store", method = RequestMethod.GET)
  public String getNutritionStore(Model model, @RequestParam String loggedFoxName) {
    model.addAttribute("loggedFox", foxservice.findFoxByName(loggedFoxName));

    //return "/nutrition-store/?loggedFoxName=" + loggedFoxName;
    //Food.values(); Drink.values();
    return "/nutrition-store";
  }

  @RequestMapping(path = "/nutrition-store", method = RequestMethod.POST)
  public String updateNutritionStore(Food food, Drink drink) {
    foxservice.editFoxFoodDrink(loggedFoxName, food, drink);
    return "redirect:/?foxName=" + loggedFoxName;
  }

}

