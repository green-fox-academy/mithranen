package com.gfa.mywebshop.controllers;

import com.gfa.mywebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//
//It contains basic links for filtering:
//    List only available
//    Order by the cheapest first
//    List only those what contain "nike" in the name or description
//    Show the average of the stock
//    Show the most expensive available item's name


@Controller
public class WebShopController {

  //
  //Fields
  private final List<ShopItem> itemList = new ArrayList<>();

  //
  //Constructors
  public WebShopController() {
    itemList.add(new ShopItem("Black Blood",
        "Turns imbiber's blood into poison; blood becomes lethal to monsters which drink it. Monsters feeding on your die immediately.",
        8, "high", "potion", 5, 180));
    itemList.add(new ShopItem("Cat",
        "Grants vision in total darkness.Seeing in the dark.", 8, "low", "potion", 13, 120));
    itemList.add(new ShopItem("Wives' Tears",
        "Neutralizes the effects of alcohol intoxication i.e. drunkenness not toxicity. Can be sold for 20 oren",
        2, "low", "potion", 7, 40));
    itemList.add(new ShopItem("Petri's Philter",
        "Increases the intensity of Signs. Sign intensity inceased by 50%.",
        2, "very high", "potion", 0, 250));
    itemList.add(new ShopItem("Dagon Sap",
        "Allows you to acquire the \"True Grit\" Strength upgrade.", 1
        , "very high", "mutagenic potion", 1, 3500));
    itemList.add(new ShopItem("Bindweed",
        "Increases resistance to acid and acid-based poisons. Acid resistance increased by 70%.", 8
        , "medium", "potion", 0, 250));
    itemList.add(new ShopItem("Kikimore's Ire",
        "Allows you to acquire the \"Mutation\" Stamina upgrade.", 1
        , "very high", "mutagenic potion", 1, 2500));
    itemList.add(new ShopItem("Kiss Poison",
        "Increases resistance to bleeding; stanches any current bleeding. Resistance to Bleeding increased by 70%.",
        8
        , "medium", "potion", 6, 211));
  }

  //
  //Methods
  //##
  @RequestMapping(path = "/webshop", method = RequestMethod.GET)
  public String showAllAccount(Model model) {
    model.addAttribute("itemList", itemList);
    model.addAttribute("resultStr", sumItemsQuantity());
    model.addAttribute("sumAllPrice", sumItemsPrice());

    return "webshop";
  }

  @RequestMapping(path = "/only-available", method = RequestMethod.GET)
  public String getOnlyAvailable(Model model) {
    List<ShopItem> outputList = itemList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("itemList", outputList);
    model.addAttribute("resultStr", sumItemsQuantity());
    model.addAttribute("sumAllPrice", sumItemsPrice());
    return "webshop";
  }

  @RequestMapping(path = "/cheapest-first", method = RequestMethod.GET)
  public String getCheapest(Model model) {
    List<ShopItem> outputList = itemList.stream()
        .sorted(Comparator.comparingInt(item -> item.getPrice()))
        .collect(Collectors.toList());
    model.addAttribute("itemList", outputList);
    model.addAttribute("resultStr", sumItemsQuantity());
    model.addAttribute("sumAllPrice", sumItemsPrice());
    return "webshop";
  }

  @RequestMapping(path = "/contains-poison", method = RequestMethod.GET)
  public String getItemWithPoisonKeyword(Model model) {
    List<ShopItem> outputList = itemList.stream()
        .filter(item -> item.getName().toLowerCase().contains("poison")
            || item.getDescription().toLowerCase().contains("poison"))
        .collect(Collectors.toList());
    model.addAttribute("itemList", outputList);
    model.addAttribute("resultStr", sumItemsQuantity());
    model.addAttribute("sumAllPrice", sumItemsPrice());
    return "webshop";
  }

  @RequestMapping(path = "/average-stock", method = RequestMethod.GET)
  public String getAverageStock(Model model) {
    String averageDefault = "";
    double output = itemList.stream()
        .mapToDouble(ShopItem::getQuantityOfStock)
        //.sum() / (double) itemList.size();
        .average()
        .orElse(0);
    if (output != 0) {
      averageDefault = "Average stock: " + output;
    }
    model.addAttribute("resultStr", averageDefault);
    model.addAttribute("itemList", itemList);
    model.addAttribute("sumAllPrice", sumItemsPrice());
    return "/average-stock";
  }

  @RequestMapping(path = "/most-expensive", method = RequestMethod.GET)
  public String getMostExpensiveItem(Model model) {
    Optional<ShopItem> mostExpensiveItem = itemList.stream()
        .max(Comparator.comparingInt(item -> item.getPrice()));
    if (mostExpensiveItem.isPresent()) {
      model
          .addAttribute("resultStr", "Most expensive potion: "
              + mostExpensiveItem.get().getName() + ", " + mostExpensiveItem.get()
              .getPrice() + " oren");
      return "/average-stock";
    }
    model.addAttribute("resultStr", "Something went wrong!");
    return "/average-stock";
  }

//  @RequestMapping(path = "/contains-poison", method = RequestMethod.GET)
//  public String searching(Model model) {
//    List<ShopItem> outputList = itemList.stream()
//        .filter(item -> item.getName().toLowerCase().contains("poison")
//            || item.getDescription().toLowerCase().contains("poison"))
//        .collect(Collectors.toList());
//    model.addAttribute("itemList", outputList);
//    model.addAttribute("resultStr", sumItemsQuantity());
//    model.addAttribute("sumAllPrice", sumItemsPrice());
//    return "webshop";
//  }

  @RequestMapping(path = "/search", method = RequestMethod.POST)
  public String searching(Model model, @RequestParam String search) {
    List<ShopItem> outputList = itemList.stream()
        .filter(item -> item.getName().toLowerCase().contains(search)
            || item.getDescription().toLowerCase().contains(search))
        .collect(Collectors.toList());
    model.addAttribute("searchedList", outputList);
    model.addAttribute("resultStr", sumItemsQuantity());
    model.addAttribute("sumAllPrice", sumItemsPrice());
    return "search";
  }

  private int sumItemsPrice() {
    int result = itemList.stream()
        .mapToInt(x -> x.getPrice() * x.getQuantityOfStock())
        .sum();
    return result;
  }

  private int sumItemsQuantity() {
    int result = itemList.stream()
        .mapToInt(x -> x.getQuantityOfStock())
        .sum();
    return result;
  }

  //
  //Getter and setter

}
