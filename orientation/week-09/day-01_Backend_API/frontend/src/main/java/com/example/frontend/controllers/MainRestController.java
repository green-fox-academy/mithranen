package com.example.frontend.controllers;

import com.example.frontend.models.log.Log;
import com.example.frontend.models.appendA.AppendA;
import com.example.frontend.models.arrayhandler.InputObject;
import com.example.frontend.models.arrayhandler.ResultArrayOutput;
import com.example.frontend.models.arrayhandler.ResultOutput;
import com.example.frontend.models.doubling.DoubleTheInput;
import com.example.frontend.models.dountil.DoUntil;
import com.example.frontend.models.dountil.DoUntilResult;
import com.example.frontend.models.error.Error;
import com.example.frontend.models.greeter.Person;
import com.example.frontend.models.log.LogsAndStaticDTO;
import com.example.frontend.service.LogService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  final LogService logService;

  @Autowired
  public MainRestController(LogService logService) {
    this.logService = logService;
  }

  //Double input
  @RequestMapping(path = "/doubling", method = RequestMethod.GET)
  public ResponseEntity<?> getDoubleNum(@RequestParam(required = false) Long input) {

    if (input == null) {
      logService.saveLog(new Log(new Date(), "/doubling", null));
      return ResponseEntity.status(HttpStatus.OK).body(new Error("Please provide an input!"));
    }
    logService.saveLog(new Log(new Date(), "/doubling", input.toString()));
    return ResponseEntity.status(HttpStatus.OK).body(new DoubleTheInput(input));
  }

  //Greeter endpoint
  @RequestMapping(path = "/greeter", method = RequestMethod.GET)
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {

    if ((name == null && title == null)) {
      logService.saveLog(new Log(new Date(), "/greeter", null));
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a name and a title!"));
    } else if (name == null) {
      logService
          .saveLog(new Log(new Date(), "/greeter", "title=".concat(title).concat(", name=null")));
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a name!"));
    } else if (title == null) {
      logService
          .saveLog(new Log(new Date(), "/greeter", "name=".concat(name).concat(", title=null")));
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a title!"));
    } else {
      logService.saveLog(
          new Log(new Date(), "/greeter", "name=".concat(name).concat(", title=").concat(title)));
      return ResponseEntity.status(HttpStatus.OK).body(new Person(name, title));

    }
  }

  //Append A endpoint
  @RequestMapping(path = "/appenda/{appendable}", method = RequestMethod.GET)
  public ResponseEntity<AppendA> appendAToInput(
      @PathVariable(name = "appendable", required = false) String inputText) {
    logService.saveLog(new Log(new Date(), "/appenda/" + inputText, inputText));
    return ResponseEntity.status(HttpStatus.OK).body(new AppendA(inputText));
  }

  //Do until
  @RequestMapping(path = "/dountil/{action}", method = RequestMethod.POST)
  public ResponseEntity<?> doUntil(@PathVariable(name = "action", required = false) String action,
      @RequestBody DoUntil doUntil) {
    if (doUntil.getUntil() == null) {
      logService.saveLog(new Log(new Date(), "/dountil/" + action, null));
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a number!"));
    }

    Long result = 0L;

    if (action.equals("sum")) {
      for (int i = 0; i <= doUntil.getUntil(); i++) {
        result += i;
      }
      logService
          .saveLog(new Log(new Date(), "/dountil/" + action, logService.saveObjectToJson(doUntil)));
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntilResult(result));
    } else if (action.equals("factor")) {
      result = 1L;
      for (int i = 1; i <= doUntil.getUntil(); i++) {
        result *= i;
      }
      logService
          .saveLog(new Log(new Date(), "/dountil/" + action, logService.saveObjectToJson(doUntil)));
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntilResult(result));
    }
    //return ResponseEntity.badRequest().build();
    return ResponseEntity.badRequest().body("Lófasz tormával!!!!");
  }

  //Array handler
  @RequestMapping(path = "/arrays", method = RequestMethod.POST)
  public ResponseEntity<?> arrayHandler(@RequestBody InputObject inputObject) {

    if (inputObject.getWhat() == null || inputObject.getNumbers() == null) {
      logService.saveLog(new Log(new Date(), "/arrays", null));
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide what to do with the numbers!"));
    } else if (inputObject.getWhat().equals("sum") || inputObject.getWhat().equals("multiply")) {
      logService.saveLog(new Log(new Date(), "/arrays", logService.saveObjectToJson(inputObject)));

      return ResponseEntity.status(HttpStatus.OK).body(
          new ResultOutput(inputObject));
    }
    logService.saveLog(new Log(new Date(), "/arrays", logService.saveObjectToJson(inputObject)));

    return ResponseEntity.status(HttpStatus.OK).body(
        new ResultArrayOutput(inputObject));
  }

  //Get log endpoint
  @RequestMapping(path = "/log", method = RequestMethod.GET)
  public LogsAndStaticDTO getAllLog() {
    LogsAndStaticDTO logsAndStaticDTO = new LogsAndStaticDTO();
    logsAndStaticDTO.setEntries(logService.findAllLogJpql());
    logsAndStaticDTO.setEntry_count(logService.countLogs());
    return logsAndStaticDTO;
  }
}
