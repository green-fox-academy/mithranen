package com.gfa.springadvanced.controllers;

import com.gfa.springadvanced.services.Euro2020ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Euro2020RestController {

  private final Euro2020ServiceImp service;

  @Autowired
  public Euro2020RestController(Euro2020ServiceImp service) {
    this.service = service;
  }

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public ResponseEntity<?> getAndSaveTeamList() {
    service.saveTeams(
        service.getTeamData(service.getEuro2020DataFrom3thPartyAPI("soccer", "euro-2020")));
    return ResponseEntity.ok().body(service.getEuro2020DataFrom3thPartyAPI("soccer", "euro-2020"));
  }

}
