package Streams.videoExamples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream_shortly {

  public static void main(String[] args) {

    List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // solving it with good old for loop
    for (int i = 0; i < myList.size(); i++) {
      if (myList.get(i) > 3) {
        System.out.println(myList.get(i));
      }
    }

    // solving it with magic
    myList.stream().filter(x -> x > 3).forEach(System.out::println);

    //1. Stream basic
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty())
        .collect(Collectors.toList());
    System.out.println(filtered);

    //2. ForEach
    //Stream has provided a new method ‘forEach’ to iterate each element of the stream.
    //10 random number
    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);

    //3. map()
    //The ‘map’ method is used to map each element to its corresponding result.
    //The following code segment prints unique squares of numbers using map.
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    //get list of unique squares
    List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct()
        .collect(Collectors.toList());
    System.out.println(squaresList);

    //4. filter()
    //The ‘filter’ method is used to eliminate elements based on a criteria.
    //The following code segment prints a count of empty strings using filter.
    List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

    //get count of empty string
    long count = strings1.stream().filter(string -> string.isEmpty())
        .count(); //TODO rossz a az doksi? , int-t akart, de aláhúzta az IDE

    //5. limit()
    //  The ‘limit’ method is used to reduce the size of the stream.
    //  The following code segment shows how to print 10 random numbers using limit.
    Random random2 = new Random();
    random2.ints().limit(10).forEach(System.out::println);

    //6. sorted()
    //The ‘sorted’ method is used to sort the stream.
    //The following code segment shows how to print 10 random numbers in a sorted order.
    Random random3 = new Random();
    random3.ints().limit(10).sorted().forEach(System.out::println);

    //7. Parallel Processing - parallelStream
    // parallelStream is the alternative of stream for parallel processing.
    // Take a look at the following code segment that prints a count of empty strings using parallelStream.

    List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    //get count of empty string
    long count1 = strings2.parallelStream().filter(string -> string.isEmpty()).count();
    //It is very easy to switch between sequential and parallel streams.

    //8. Collectors
    //Collectors are used to combine the result of processing on the elements of a stream.
    // Collectors can be used to return a list or a string.

    List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    List<String> filtered1 = strings3.stream().filter(string -> !string.isEmpty())
        .collect(Collectors.toList());

    System.out.println("Filtered List: " + filtered1);
    String mergedString = strings3.stream().filter(string -> !string.isEmpty())
        .collect(Collectors.joining(", "));
    System.out.println("Merged String: " + mergedString);

    //9. Statistics
    //With Java 8, statistics collectors are introduced to calculate all statistics when
    //stream processing is being done.

    List numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    IntSummaryStatistics stats = numbers2.stream().mapToInt((x) -> (int) x).summaryStatistics();

    System.out.println("Highest number in List : " + stats.getMax());
    System.out.println("Lowest number in List : " + stats.getMin());
    System.out.println("Sum of all numbers : " + stats.getSum());
    System.out.println("Average of all numbers : " + stats.getAverage());
  }
}
