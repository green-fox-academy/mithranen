package com.gfa.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  private AtomicLong counting = new AtomicLong(1);

  @RequestMapping(path = "/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(defaultValue = "Viktor", name = "name") String név) {
    return new Greeting(counting.getAndIncrement(), "Hello" + " " + név + "!");
  }

}
