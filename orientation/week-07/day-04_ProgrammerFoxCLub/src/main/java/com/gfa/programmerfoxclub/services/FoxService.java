package com.gfa.programmerfoxclub.services;

import com.gfa.programmerfoxclub.modules.Drink;
import com.gfa.programmerfoxclub.modules.Food;
import com.gfa.programmerfoxclub.modules.Fox;
import com.gfa.programmerfoxclub.modules.Trick;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class FoxService {

  //
  //Fields
  private List<Fox> foxes;


  //
  //Constructors
  public FoxService(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public FoxService() {
    this.foxes = new ArrayList<>();
  }

  //
  //Methods
  public Fox add(Fox fox) {
    foxes.add(fox);
    return fox;
  }

  public Fox findFoxByName(String foxName) {
    for (Fox fox : foxes) {
      if (foxName.equals(fox.getName())) {
        return fox;
      }
    }
    return add(new Fox(foxName, Collections.singletonList(Trick.AMBUSH), Food.BUG, Drink.BLOOD));
  }

  public void editingFoxFoodDrink(String foxName, Food food, Drink drink) {
    for (Fox fox : foxes) {
      if (foxName.equals(fox.getName())) {
        fox.setFood(food);
        fox.setDrink(drink);
      }
    }
  }

}
