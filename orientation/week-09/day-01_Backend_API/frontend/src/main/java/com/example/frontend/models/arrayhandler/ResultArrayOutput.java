package com.example.frontend.models.arrayhandler;

import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultArrayOutput {

  private Integer[] result;

  public ResultArrayOutput(InputObject inputObject) {
    this.result = getResultByOperators(inputObject.getWhat(), inputObject.getNumbers());
  }

  public Integer[] getResultByOperators(String what, Integer[] numbers) {
    if (what.equals("double")) {
      return Arrays.stream(numbers).map(n -> n * 2).map(Object::toString)
          .map(Integer::valueOf).toArray(Integer[]::new);
    }
    return null;
  }
}
