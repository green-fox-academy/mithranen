package Streams;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10Fox implements Comparable<Exercise10Fox> {

  public static void main(String[] args) {

    //## Exercise 10
    //
    //    !Create a Fox class with 3 properties:`name`, `color` and `age` Fill a list with
    //    at least 5 foxes and:
    List<Exercise10Fox> foxesList = Arrays.asList(
        new Exercise10Fox("Charles", "green", 2),
        new Exercise10Fox("Lewis", "blue", 6),
        new Exercise10Fox("Thomas", "green", 10),
        new Exercise10Fox("Charlotte", "red", 1),
        new Exercise10Fox("Matthew", "grey", 5)
    );

    //    - Write a Stream Expression to find the foxes with green color!
    foxesList.stream()
        .filter(fox -> fox.getColor().contains("green"))
        .forEach(System.out::println);

    System.out.println("-------------------------");
    //    - Write a Stream Expression to find the foxes with green color, and age less
    //    then 5 years!
    foxesList.parallelStream()
        .filter(fox -> fox.getColor().contains("green"))
        .filter(fox -> fox.getAge() < 5)
        .forEach(System.out::println);

    System.out.println("----------------------------");

    //Sorting objects by age
    foxesList.parallelStream()
        .sorted()
        .sequential()
        .forEach(System.out::println);

    System.out.println("----------------------------");
    //
    //    - Write a Stream Expression to find the frequency of foxes by color!
    Map<String, List<Exercise10Fox>> colorFrequencies = foxesList.parallelStream()
        .collect(Collectors.groupingBy(Exercise10Fox::getColor));
    System.out.println(colorFrequencies);

    Map<String, Long> colorFrequencies2 = foxesList.parallelStream()
        .collect(Collectors.groupingBy(Exercise10Fox::getColor, Collectors.counting()));
    System.out.println(colorFrequencies2);

    Map<String, Integer> colorFrequencies3 = foxesList.stream()
        .collect(toMap(
            k -> k.color,                                            // key
            v -> 1,
            (oldValue, newValue) -> oldValue + newValue));     // 1 occurence
    //Integer::sum));                                 // counting
    System.out.println("Frequencies:\n" + colorFrequencies3);

  }

  //
  //Fields
  private String name;
  private String color;
  private int age;

  //
  //Constructors

  public Exercise10Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  //
  //Methods
  @Override
  public String toString() {
    return name + ", " + color + ", " + age;
  }

  @Override
  public int compareTo(Exercise10Fox anotherFox) {
    return Integer.compare(this.age, anotherFox.age);
  }

  //
  //Getter and setter

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }
}
