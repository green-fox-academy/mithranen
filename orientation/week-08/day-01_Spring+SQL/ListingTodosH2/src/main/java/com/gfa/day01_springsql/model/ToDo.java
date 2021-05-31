package com.gfa.day01_springsql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class ToDo {

  //fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  //constructors
  public ToDo() {
  }

  public ToDo(long id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  //getters and setters --> Lombok


}
