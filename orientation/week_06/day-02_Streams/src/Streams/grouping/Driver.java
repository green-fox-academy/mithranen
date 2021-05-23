package Streams.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*; //--> you can delete "Collectors." from every stream

public class Driver {

  public static void main(String[] args) {
    List<Person> personList = populateWithData();

    System.out
        .println("---obtain US and non-US based persons using partitioningBy & groupingBy---");

    System.out.println(personList.parallelStream()
        .collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"))));
    System.out.println(personList.parallelStream()
        .collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"))));

    System.out.println("---count US and non-US based persons using partitioningBy & groupingBy---");

    System.out.println(personList.parallelStream()
        .collect(Collectors
            .partitioningBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));
    System.out.println(personList.parallelStream()
        .collect(Collectors
            .groupingBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));

    System.out
        .println("---obtain the persons in each country and count them using partitioningBy---");
    System.out.println(personList.parallelStream()
        .collect(Collectors.groupingBy((Person p) -> p.getCountry())));
    System.out.println(personList.parallelStream()
        .collect(Collectors.groupingBy((Person p) -> p.getCountry(), Collectors.counting())));

    System.out.println(
        "-obtain US and non-US persons using partitioningBy & map names to uppercase using mapping-");
    System.out.println(personList.parallelStream()
        .collect(Collectors.partitioningBy((Person p) -> p.getCountry()
                .equals("US"),
            Collectors.mapping(p -> p.getName().toUpperCase(Locale.ROOT), Collectors.toList()))));

    System.out.println(
        "---obtain persons in each country using partitioningBy & map names to uppercase using mapping---");
    System.out.println(personList.parallelStream()
        .collect(Collectors.groupingBy((Person p) -> p.getCountry(),
            Collectors.mapping(p -> p.getName().toUpperCase(Locale.ROOT), Collectors.toList()))));
  }

  private static List<Person> populateWithData() {
    List<Person> personList = new ArrayList<>();

    Person person1 = new Person("Jane", "US");
    Person person2 = new Person("Gerald", "GRB");
    Person person3 = new Person("Xavier", "ESP");
    Person person4 = new Person("Arnold", "AU");
    Person person5 = new Person("Kata", "HUN");
    Person person6 = new Person("Angie", "US");
    Person person7 = new Person("Jorge", "ARG");
    Person person8 = new Person("Julia", "ITA");

    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);
    personList.add(person5);
    personList.add(person6);
    personList.add(person7);
    personList.add(person8);

    return personList;
  }
}
