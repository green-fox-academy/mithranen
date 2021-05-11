package AbstractsInterfaces.printable;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    Domino domino1 = new Domino(3, 2);
    dominoes.add(domino1);

    List<ToDo> todos = new ArrayList<>();
    ToDo todo1 = new ToDo("Buy milk", "high", true);
    todos.add(todo1);

    for (Domino domino : dominoes) {
      domino.printAllFields();
    }

    for (ToDo todo : todos) {
      todo.printAllFields();
    }
  }

}
