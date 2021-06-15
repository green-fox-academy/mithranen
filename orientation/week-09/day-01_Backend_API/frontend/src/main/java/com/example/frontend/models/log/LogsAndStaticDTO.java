package com.example.frontend.models.log;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogsAndStaticDTO {

  private List<Log> entries;
  private int entry_count;

  public LogsAndStaticDTO() {
  }
}
