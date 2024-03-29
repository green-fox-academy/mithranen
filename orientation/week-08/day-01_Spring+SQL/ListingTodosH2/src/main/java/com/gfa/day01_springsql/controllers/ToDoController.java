package com.gfa.day01_springsql.controllers;

//Create a new controller called TodoController which maps to /todo
//    Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.
//    Run the application. If all works fine, then you can go ahead.


import com.gfa.day01_springsql.model.ToDo;
import com.gfa.day01_springsql.repositories.ToDoRepository;

import com.gfa.day01_springsql.services.ToDoService;
import java.awt.Checkbox;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@Setter
@Controller
@RequestMapping("/todo")
public class ToDoController {

  private ToDoRepository toDoRepository;
  private ToDoService toDoService;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository, ToDoService toDoService) {
    this.toDoRepository = toDoRepository;
    this.toDoService = toDoService;
  }

  //Read TodoList
  @RequestMapping(path = {"/", "/list"}, method = RequestMethod.GET)
  public String listTodos(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }

  //Query string
//  @RequestMapping(path = "/search", method = RequestMethod.GET)
//  public String searching(Model model, @RequestParam(value = "searchedWord") String searchedWord,
//      @RequestParam(value = "option") String option) {
//    if (option.contains("title")) {
//      model.addAttribute("searchResult", toDoRepository.findByTitleContains(searchedWord));
//    }
//      return "todolist";
//    }

  //Form + get --> C type
/*  @RequestMapping(path = "/search", method = RequestMethod.GET)
  public String searching(Model model, @RequestParam String searchedWord,
      @RequestParam String option) {
    if (option.contains("title")) {
      model.addAttribute("todos", toDoRepository.findByTitleContainsIgnoreCase(searchedWord));
    } else if (option.contains("description")) {
      model.addAttribute("todos", toDoRepository.findByDescriptionContainsIgnoreCase(searchedWord));
    } else if (option.contains("content")) {
      String searchedWord2 = searchedWord;
      model.addAttribute("todos", toDoRepository.findByTitleOrDescriptionContaining(searchedWord, searchedWord2));
    }
    return "todolist";
  }*/

  //Searching in TodoList
/*  @RequestMapping(path = "/search", method = RequestMethod.GET)
  public String searching(Model model, @RequestParam String searchedWord,
      @RequestParam String option,
      @RequestParam(name = "isActive", defaultValue = "false") Boolean isActive) {
    model.addAttribute("todoList", toDoService.filterTodos(searchedWord, option, isActive));
    return "todolist";
  }*/

//Example for switch - Searching in TodoList by options
  @RequestMapping(path = "/search", method = RequestMethod.GET)
  public String searching(Model model, @RequestParam String searchedWord, @RequestParam String option) {
    switch (option) {
      case "title":
        model.addAttribute("todos", toDoRepository.findByTitleContainsIgnoreCase(searchedWord));
        break;
      case "description":
        model.addAttribute("todos",
            toDoRepository.findByDescriptionContainsIgnoreCase(searchedWord));
        break;
      case "content": {
        model.addAttribute("todos",
            toDoRepository
                .findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(searchedWord,
                    searchedWord));
      }
    }
    return "todolist";
  }

}
