package com.example.day03_dependencyinjection.UsefulUtilities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsefulUtilitiesController {

  //Field
  private UtilityService service;

  //Constructor
  @Autowired
  public UsefulUtilitiesController(UtilityService service) {
    this.service = service;
  }

  //Methods - Endpoints

  @RequestMapping(path = "/useful", method = RequestMethod.GET)
  public String getHome() {
    return "useful";
  }

  @RequestMapping(path = "/useful/colored", method = RequestMethod.GET)
  public String getRandomColor(Model model) {
    model.addAttribute("randomColor", service.randomColor());
    return "useful";
  }

  @RequestMapping(path = "/useful/email", method = RequestMethod.GET)
  public String searching(Model model) {
    model.addAttribute("randomColor", service.randomColor());
    return "useful";
  }
}
