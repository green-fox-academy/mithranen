package com.gfa.groot.controllers;

import com.gfa.groot.models.Error;
import com.gfa.groot.service.CargoOfRoraService.cargoOfRoraService.CargoOfRoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoOfRoraController {

  private CargoOfRoraService cargoOfRoraService;

  @Autowired
  public CargoOfRoraController(
      CargoOfRoraService cargoOfRoraService) {
    this.cargoOfRoraService = cargoOfRoraService;
  }

  @RequestMapping(path = "/rocket", method = RequestMethod.GET)
  public ResponseEntity<?> displayShipStatus() {
    return ResponseEntity.status(HttpStatus.OK).body(cargoOfRoraService.getCargoOfRora());
  }

  @RequestMapping(path = "/rocket/fill", method = RequestMethod.GET)
  public ResponseEntity<?> fillShipWithAmmo(
      @RequestParam(required = false) String caliber,
      @RequestParam(required = false) Integer amount) {

    if (caliber == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("You did not add ammo to the Ship!"));
    }
    return ResponseEntity.status(HttpStatus.OK)
        .body(cargoOfRoraService.fillRoraWithAmmo(caliber, amount));
  }
}
