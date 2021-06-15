package com.example.frontend.service;

import com.example.frontend.models.log.Log;
import com.example.frontend.repositories.LogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
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
    return logRepository.findAllLog();
  }

  //Count logs from DB
  public int countLogs (){
    return logRepository.countAllLogs();
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
