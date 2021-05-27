package com.example.day03_dependencyinjection.UsefulUtilities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
  public String seneEmail(Model model, @RequestParam String emailAddress,
      @RequestParam String emailAddress2) {
    model.addAttribute("email", service.validateEmail(emailAddress));
    model.addAttribute("email2", service.validateEmail(emailAddress2));
    model.addAttribute("color", service.getAlertStyle(emailAddress));
    model.addAttribute("color2", service.getAlertStyle(emailAddress2));
    return "useful";
  }
}
