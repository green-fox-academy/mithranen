package com.gfa.springadvanced.repositories;

import com.gfa.springadvanced.daos.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

  boolean existsByTeamNameAndIsoCode(String teamName, String isoCode);

  boolean existsByTeamName(String teamName);
}
