package com.gfa.day01_springsql.services;

import com.gfa.day01_springsql.model.ToDo;
import com.gfa.day01_springsql.repositories.ToDoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  private final ToDoRepository toDoRepository;

  @Autowired
  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

/*  //method
  public List<ToDo> filterTodos(String searchedWord, String searchInOption, Boolean isActive) {
    switch (searchInOption) {
      case "title":
        return toDoRepository.findByTitleContainsIgnoreCase(searchedWord);
      break;
      case "description":
        return toDoRepository.findByDescriptionContainsIgnoreCase(searchedWord);
      break;
      case "content":
        return toDoRepository
            .findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(searchedWord,
                searchedWord);
    }
    return new List<ToDo>();
  }*/
}
