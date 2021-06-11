package com.gfa.groot.controllers;

import com.gfa.groot.models.arrowOfYondu.ArrowOfYonduDTO;
import com.gfa.groot.models.Error;
import com.gfa.groot.models.groot.GrootMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  //Groot
  @RequestMapping(path = "/groot", method = RequestMethod.GET)
  public ResponseEntity<?> getGrootMessage(
      @RequestParam(required = false) String message) {

    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("I am Groot!"));
    }
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(new GrootMessageDTO(message, "I am Groot!"));
  }

  @RequestMapping(path = "/yondu", method = RequestMethod.GET)
  public ResponseEntity<?> calculateArrowOfYondu(
      @RequestParam(required = false) Double distance,
      @RequestParam(required = false) Double time) {

    if (distance == null || time == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("I AM GROOOT!"));
    }

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(new ArrowOfYonduDTO(distance, time));
  }
}
