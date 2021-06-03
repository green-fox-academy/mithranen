package com.gfa.day01_springsql.repositories;

import com.gfa.day01_springsql.model.ToDo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

  // JPQL query using named method parameter
  // Java Persistence Query Language
/*
  @Query(value = "SELECT p FROM ToDo p WHERE p.title = :title")
*/

  List<ToDo> findByTitleContainsIgnoreCase(String searchedWord);

  List<ToDo> findByDescriptionContainsIgnoreCase(String searchedWord);

  List<ToDo> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String searchedWord, String searchedWord2);
}
