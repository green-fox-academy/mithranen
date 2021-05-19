package Streams;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

  public static void main(String[] args) {

    //    # Exercise 1
    //
    //    Write a Stream Expression to get the even numbers from the following list:
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    List<Integer> evenNums = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNums);

    System.out.println("--------------------------------------------------");

    //## Exercise 2
    //
    //    Write a Stream Expression to get the squared value of the positive numbers from
    //    the following list:
    List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> positiveNumsSquared = numbers1.stream()
        .filter(n -> n >= 0)
        .map(i -> i = (int) Math.pow(i, 2))
        .collect(Collectors.toList());
    System.out.println(positiveNumsSquared);

    numbers1.stream().filter(n -> n >= 0)
        .map(i -> i = (int) Math.pow(i, 2))
        .map(s -> s.toString() + ", ").forEach(
        System.out::print);

    System.out.println("\n--------------------------------------------------");

    //## Exercise 3
    //
    //TODO MAP???
    //   Write a Stream Expression to find which number squared value is more then 20
    //  from the following list:
    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredNumsOver20 = numbers2.stream()
        .map(i -> i = (int) Math.pow(i, 2))
        .filter(i -> i > 20)
        .collect(Collectors.toList());

    System.out.println(squaredNumsOver20);

    System.out.println("--------------------------------------------------");

    //## Exercise 4
    //
    //    Write a Stream Expression to get the average value of the odd numbers from the
    //    following list:

    List<Integer> numbers3 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    double average = numbers3.stream()
        .filter(n -> n % 2 != 0)
        .mapToDouble(n -> n)
        .average()
        .orElse(0);
    System.out.println(average);

    System.out.println("--------------------------------------------------");

    //## Exercise 5
    //
    //    Write a Stream Expression to get the sum of the odd numbers in the following
    List<Integer> numbers4 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int sum = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .sum();

    System.out.println(sum);

    Integer sum2 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .reduce(0, (a, b) -> a + b);

    System.out.println(sum2);

    Integer sum3 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .reduce(0, Integer::sum);
    System.out.println(sum3);

    Integer sum4 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .collect(Collectors.summingInt(Integer::intValue));
    System.out.println(sum4);

    System.out.println("--------------------------------------------------");

    //## Exercise 6
    //
    //    Write a Stream Expression to find the uppercase characters in a string!
    String str = "Write a Stream Expression to find the uppercase characters in a string!";

    String uppercaseChars = str.chars()
        .filter(Character::isUpperCase)
        .mapToObj(c -> Character.toString((char) c))
        .collect(Collectors.joining());

    System.out.println(uppercaseChars);

    String uppercaseChars2 = str.chars()
        .mapToObj(n -> Character.valueOf((char) n))
        .filter(ch -> Character.isUpperCase(ch))
        .map(c -> Character.toString(c))
        .collect(Collectors.joining());

    System.out.println(uppercaseChars2);

    System.out.println("--------------------------------------------------");

    //## Exercise 7
    //
    //    Write a Stream Expression to find the strings which starts with a given
    //    letter(as parameter), in the following list:
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

    char letter = 'C';

    List<String> result = cities.stream()
        .filter(s -> s.startsWith(String.valueOf(letter)))
        //.filter(s->s.startsWith("C"))
        .toList();
    //.collect(Collectors.toList());

    System.out.println(result);

    System.out.println("--------------------------------------------------");

    //## Exercise 8
    //
    //    Write a Stream Expression to concatenate a Character list to a string!
    List<Character> characters = Arrays.asList('S', 't', 'a', 'r', ' ', 'W', 'a', 'r', 's');

    String oneStr2 = characters.stream()
        .map(c -> c.toString())
        .collect(Collectors.joining());
    System.out.println(oneStr2);

    StringBuilder builder = new StringBuilder();
    characters.stream()
        .forEach(ch -> builder.append(ch));
    System.out.println(builder);

    //Akár char arraybe is ki lehetne

    String oneStr1 = characters.stream()
        .collect(Collector.of(
            StringBuilder::new,
            StringBuilder::append,
            StringBuilder::append,
            StringBuilder::toString));

    System.out.println(oneStr1);

    System.out.println("--------------------------------------------------");

    //## Exercise 9
    //
    //Write a Stream Expression to find the frequency of characters in a given string!

    String givenStr = "Write a Stream Expression to find the frequency of characters in a given string!";

    Map<Character, Integer> charsFrequencies = givenStr.chars()
        .boxed()
        .collect(toMap(
            k -> Character.valueOf((char) k.intValue()),    // key = char
            v -> v = 1,
            (oldValue, newValue) -> oldValue + newValue));     // 1 occurence
    //Integer::sum));                                 // counting
    System.out.println("Frequencies:\n" + charsFrequencies);


  }
}
