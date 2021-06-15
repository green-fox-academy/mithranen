package com.gfa.reverserofthesith.services;

import com.gfa.reverserofthesith.dtos.InputSithDTO;
import com.gfa.reverserofthesith.dtos.OutputYodaDTO;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private final OutputYodaDTO outputYodaDTO = new OutputYodaDTO();


  public OutputYodaDTO sithTextConvertToJedi(InputSithDTO inputSithDTO) {
    String outputYodaText = outputYodaDTO.theGreatSithReverserFromYoda(inputSithDTO.getSith_text());
    outputYodaDTO.setYoda_text(outputYodaText);
    return outputYodaDTO;
  }

}

