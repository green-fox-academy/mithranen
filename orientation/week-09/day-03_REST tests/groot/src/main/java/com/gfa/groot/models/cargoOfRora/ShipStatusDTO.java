package com.gfa.groot.models.cargoOfRora;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipStatusDTO {

  private String received;
  private int amount;
  @JsonProperty("shipstatus")
  private String shipStatus;
  private boolean ready;

  public ShipStatusDTO(CargoOfRora cargoOfRora, String received, int amount) {
    this.received = received;
    this.amount = amount;
    shipStatus = cargoOfRora.getShipStatus();
    ready = cargoOfRora.isReady();
  }
}
