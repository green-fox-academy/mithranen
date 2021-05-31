package com.gfa.day01_springsql.controllers;

//Create a new controller called TodoController which maps to /todo
//    Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.
//    Run the application. If all works fine, then you can go ahead.

import com.gfa.day01_springsql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @RequestMapping(path = {"/", "/list"}, method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute(toDoRepository.findAll());
    return "todo";
  }

}
