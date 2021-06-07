package com.example.frontend;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication {

  public static void main(String[] args) {
    SpringApplication.run(FrontendApplication.class, args);
   /* System.out
        .println(FrontendApplication.getResultByOperators("multiply", new Integer[]{1, 2, 5, 10}));

    System.out.println(FrontendApplication.getResultByOperators("double", new Integer[]{1, 2, 5, 10}));
  }

  public static Set<?> getResultByOperators(String what, Integer[] numbers) {
    switch (what) {
      case "sum":
        return Collections.singleton(Arrays.stream(numbers).mapToInt(n -> n).sum());
      case "multiply":
        return Collections.singleton(Arrays.stream(numbers).reduce(1, (a, b) -> a * b));
      case "double":
        return Collections.singleton((Integer[]) Arrays.stream(numbers).map(n -> n * 2).toArray());
    }
    return null;
  }*/
  }
}
