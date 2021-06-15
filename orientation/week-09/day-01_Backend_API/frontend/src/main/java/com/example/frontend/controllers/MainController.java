package com.example.frontend.controllers;

import com.example.frontend.models.log.Log;
import com.example.frontend.service.LogService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  final LogService logService;

  @Autowired
  public MainController(LogService logService) {
    this.logService = logService;
  }

  //rendering index.html
  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String displayMainPage() {
    logService.saveLog(new Log(new Date(), "/", ""));
    return "index";
  }

}