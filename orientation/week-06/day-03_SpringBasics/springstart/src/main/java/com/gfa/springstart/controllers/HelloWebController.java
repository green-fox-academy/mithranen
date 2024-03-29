package com.gfa.springstart.controllers;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  private AtomicLong counting = new AtomicLong(1);
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den",
      "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};


  @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
  public String greeting(Model model,
      @RequestParam(defaultValue = "Tolkien", name = "name") String név) {

    Random random = new Random();

    model.addAttribute("hello", hellos[random.nextInt(hellos.length)]);
    model.addAttribute("name", név);
    model.addAttribute("counter", counting.getAndIncrement());
    return "greeting";
  }

}
