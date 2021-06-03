package com.gfa.day01_springsql;

import com.gfa.day01_springsql.controllers.ToDoController;
import com.gfa.day01_springsql.model.Assignee;
import com.gfa.day01_springsql.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gfa.day01_springsql.model.ToDo;

@SpringBootApplication
public class ListingTodosH2Application implements CommandLineRunner {

  //Lehetne egyből repoból
  /*  private ToDoRepository todoRepository;*/
  private ToDoController toDoController;
  private MainService mainService;

  @Autowired
  public ListingTodosH2Application(ToDoController toDoController, MainService mainService) {
    this.toDoController = toDoController;
    this.mainService = mainService;
  }

  //Lehetne egyből repoból
/*  @Autowired
  public ListingTodosH2Application(ToDoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }*/

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosH2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoController.getToDoRepository()
        .save(new ToDo("Start the day", "wake up drink coffee and start working", false, false));
    toDoController.getToDoRepository()
        .save(new ToDo("Finish H2 workshop1", "understand H2 and solve task", true, true));
    toDoController.getToDoRepository()
        .save(new ToDo("Finish JPA workshop2", "understand JPA and solve task", true, false));
    toDoController.getToDoRepository().save(
        new ToDo("Create a CRUD project", "a repo having CRUD: create, read, update and delete",
            false, true));
    toDoController.getToDoRepository().save(
        new ToDo("End of the day", "finishing all works",
            false, true));

    mainService.createAssignee(new Assignee("Thomas", "thomas@gmail.com"));
    mainService.createAssignee(new Assignee("Erica", "EricaSmart@gmail.com"));
  }
}
