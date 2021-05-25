package Streams.videoExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntroductionToStreams {

  //streams: sequence of elements supporting sequential and parallel aggregate operations.
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Charles", "Dickens", 60),
        new Person("Lewis", "Carroll", 42),
        new Person("Thomas", "Carlyle", 51),
        new Person("Charlotte", "Bronte", 60),
        new Person("Matthew", "Arnold", 39)
    );

    //STREAMS AND LAMBDAS
    //Get people whose last name begins with "C" and print it out its first name
    //stream have 3 elements:
    // - source,
    // - intermediate operation: all operations that need to be perform (filter) -> setting operation on a stream
    // - end condition/terminal operation - what have to do the stream (forEach)
    //        - not having them --> stream doesn't do nothing, not get started
    people.stream()                                                   //source
        .filter(predicate -> predicate.getLastName().startsWith("D")) //intermediate operation
        .forEach(
            person -> System.out.println(person.getFirstName())); //terminal operation-end condition

    //assign stream to local variable
    //way of looking of at the people collection TODO nothing happens now, execute statement, but not iterating
    Stream<Person> stream = people.stream();

    //setting operation on a stream --> asking worker to sit at a particular position on the assembly line,
    // but we haven't even started the assembly line yet
    long count = people.stream() // source
        .filter(predicate -> predicate.getLastName().startsWith("C")) // filter os the stream
        //count of elements in the stream, stream ends/ tunnel condition
        //  --> starts the stream, source (collection of elements) are going to trough the stream, returns a count
        .count();

    System.out.println(count);

    //stream: iteration out of your control, not external iteration --> internal
    //  --> control into runtime, from hands of developers
    //Advantage:
    //  --> can have different portions of collections handled different processors
    //  --> multicore processors: you can have huge collections for instance execute different things in different course
    //    --> 2 separated assembly lines having bunch of different elements

    //Paralel Stream
    // potentially splits the collection into multiple stream --> if you have multiple-core
    // --> do the same things (command) parallel just in one-one smaller portion of the collection
    // --> same result but faster!!!!!!
    // --> it comes from functional programming model that lamdba is enable
    count = people.parallelStream()
        .filter(predicate -> predicate.getLastName().startsWith("C"))
        .count();

    System.out.println(count);

    //FUNCTIONAL INTERFACE
    //Predicate: has only one method and it doesn't have definition ({})
    class EventNumberPredicate implements Predicate<Integer> {

      @Override
      public boolean test(Integer number) {
        // --> creating a Lamdba exprexions, providing implementation for specific method
        // retunr redicate interface if test are passed
        return number % 2 == 0;
      }
    }

    //Stream<T> filter(Predicate<? super T> predicate); --> interface
    //boolean test(T t); --> Predicate interface's methods, only without implementation
    List.of(23, 43, 34, 45, 36, 48).parallelStream()
        //passing logic to filter method
        //background Java compiler creates implementation of functional interface
        .filter(nums -> nums % 2 == 0)
        .forEach(elements -> System.out.println(elements));

    List.of(23, 43, 34, 45, 36, 48).parallelStream()
        //passing logic to filter method
        //background Java compiler creates implementation of functional interface (mow Predicate)
        .filter(new EventNumberPredicate())
        .forEach(elements -> System.out.println(elements));

    //GROUPING - Collect Stream methods

  }
}

