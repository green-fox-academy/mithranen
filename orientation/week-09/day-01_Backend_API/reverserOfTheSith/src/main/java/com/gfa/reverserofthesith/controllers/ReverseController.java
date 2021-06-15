package com.gfa.reverserofthesith.controllers;

import com.gfa.reverserofthesith.dtos.InputSithDTO;
import com.gfa.reverserofthesith.errors.NoInputTextError;
import com.gfa.reverserofthesith.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

  private final MainService service;

  @Autowired
  public ReverseController(MainService service) {
    this.service = service;
  }

  @RequestMapping(path = "/sith", method = RequestMethod.POST)
  public ResponseEntity<?> createYodaTextFromSithText(
      @RequestBody(required = false) InputSithDTO inputSithDTO) {
    if (inputSithDTO == null ||
        inputSithDTO.getSith_text() == null ||
        inputSithDTO.getSith_text()
            .equals("")) {
      return ResponseEntity.ok(new NoInputTextError());
    }
    return ResponseEntity.ok(service.sithTextConvertToJedi(inputSithDTO));
  }
}
