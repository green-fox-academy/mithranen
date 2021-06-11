package com.gfa.groot.service.CargoOfRoraService.cargoOfRoraService;

import com.gfa.groot.models.cargoOfRora.CargoOfRora;
import com.gfa.groot.models.cargoOfRora.ShipStatusDTO;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class CargoOfRoraService {

  //field
  private final CargoOfRora cargoOfRora = new CargoOfRora();

  //fill Ship withAmmo
  public ShipStatusDTO fillRoraWithAmmo(String received, int amount) {
    cargoOfRora.addAmmo(received, amount);
    return new ShipStatusDTO(cargoOfRora, received, amount);
  }
}
