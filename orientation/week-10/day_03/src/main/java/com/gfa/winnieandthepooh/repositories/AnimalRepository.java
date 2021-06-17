package com.gfa.winnieandthepooh.repositories;

import com.gfa.winnieandthepooh.models.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

  @Query(value = "SELECT animal FROM Animal animal WHERE animal.name = :searchedName")
  Animal findByName(String searchedName);

//@Query(value = "SELECT animal FROM Animal animal WHERE animal.name = :searchedName")
  boolean existsByName(String searchedName);
}
