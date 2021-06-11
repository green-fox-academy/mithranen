package com.example.frontend.repositories;

import com.example.frontend.models.Log;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

  @Query (value = "SELECT log FROM Log log")
  List<Log> findAll();


}
