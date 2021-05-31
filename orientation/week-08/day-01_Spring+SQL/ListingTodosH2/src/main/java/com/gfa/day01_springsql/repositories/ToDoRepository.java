package com.gfa.day01_springsql.repositories;

import com.gfa.day01_springsql.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
