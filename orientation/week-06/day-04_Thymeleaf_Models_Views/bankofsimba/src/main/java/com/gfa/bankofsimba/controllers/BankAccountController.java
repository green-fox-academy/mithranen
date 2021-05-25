package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {

  //
  //Fields
  private List<BankAccount> accountList = new ArrayList<>();

  //
  //Constructors
  public BankAccountController() {
    accountList.add(new BankAccount("Simba", 2000.05, "lion", true, true));
    accountList.add(new BankAccount("Zordon", 1700.00, "lion", false, false));
    accountList.add(new BankAccount("Mufasa", 2500.99, "lion", true, true));
    accountList.add(new BankAccount("Nala", 2000, "lion", true, true));
    accountList.add(new BankAccount("Zazu", 10, "bird", false, true));
  }

  //## Showing one Account
  //## Formatting the balance
  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000.00, "lion", true, true);
    model.addAttribute("account", simba);
    return "show";
  }

  //## HTMLception
  @RequestMapping(path = "/empty", method = RequestMethod.GET)
  public String textForEmty() {
    return "empty";
  }

  //## Filling multiple Accounts
  @RequestMapping(path = "/show-all", method = RequestMethod.GET)
  public String showAllAccount(Model model) {
    model.addAttribute("accountList", accountList);
    return "show-all";
  }

}

