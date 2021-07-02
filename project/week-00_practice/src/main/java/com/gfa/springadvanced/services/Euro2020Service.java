package com.gfa.springadvanced.services;

import com.gfa.springadvanced.dtos.TeamDTO;
import org.springframework.stereotype.Service;

@Service
public interface Euro2020Service {

  void saveNewTeam(String teamName, String isoCode);

  boolean isTeamExist(String teamName, String isoCode);



}
