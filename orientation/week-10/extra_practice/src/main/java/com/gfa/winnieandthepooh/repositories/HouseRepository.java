package com.gfa.winnieandthepooh.repositories;

import com.gfa.winnieandthepooh.models.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Long> {

}
