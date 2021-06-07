package com.example.frontend.models.arrayhandler;

import java.util.Arrays;

import lombok.Getter;

@Getter
public class ResultOutput {

  private Integer result;

  public ResultOutput(InputObject inputObject) {
    this.result = getResultByOperators(inputObject.getWhat(), inputObject.getNumbers());
  }

  public Integer getResultByOperators(String what, Integer[] numbers) {
    switch (what) {
      case "sum":
        return Arrays.stream(numbers).mapToInt(n -> n).sum();
      case "multiply":
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }
    return null;
  }
}
