package com.example.frontend.service;

import com.example.frontend.models.Log;
import com.example.frontend.models.dountil.DoUntil;
import com.example.frontend.repositories.LogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  //Save logs
  public void saveLog(Log log) {
    logRepository.save(log);
  }

  //Read all logs
  public List<Log> findAllLogJpql() {
    return logRepository.findAll();
  }

  //Java to JSON object
  public String saveObjectToJson(Object inputObject) {
    ObjectMapper Obj = new ObjectMapper();
    String jsonStr = "";
    try {
      jsonStr = Obj.writeValueAsString(inputObject);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return jsonStr;
  }
}
