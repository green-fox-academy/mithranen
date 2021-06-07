package com.example.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  //rendering index.html
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String displayMainPage() {
    return "index";
  }

}