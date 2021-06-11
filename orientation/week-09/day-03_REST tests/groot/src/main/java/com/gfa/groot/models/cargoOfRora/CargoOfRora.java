package com.gfa.groot.models.cargoOfRora;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CargoOfRora {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  @JsonProperty("shipstatus")
  private String shipStatus;
  private boolean ready;

  public CargoOfRora() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipStatus = "empty";
    this.ready = false;
  }

  //TODO why not working without return an re-re update
  public void addAmmo(String received, int amount) {
    switch (received) {
      case ".25":
        caliber25 += amount;
        updateShipStatusAndReadiness();
        return;
      case ".30":
        caliber30 += amount;
        updateShipStatusAndReadiness();
        return;
      case ".50":
        caliber50 += amount;
        updateShipStatusAndReadiness();
    }
  }

  public void updateShipStatusAndReadiness() {
    double amountAllCaliber = caliber25 + caliber50 + caliber30;
    double maxAmmo = 12500;
    double percentage = amountAllCaliber / maxAmmo * 100;

    if (amountAllCaliber == 0) {
      shipStatus = "empty";
    } else if (amountAllCaliber == maxAmmo) {
      shipStatus = "full";
    } else if (amountAllCaliber > maxAmmo) {
      shipStatus = "overloaded";
    } else {
      shipStatus = percentage + "%";
    }

    ready = shipStatus.equals("full");
  }
}
