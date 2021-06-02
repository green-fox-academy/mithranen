package com.gfa.day01_springsql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "todo_list")
public class ToDo {

  //fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String description;
  private boolean urgent;
  private boolean done;

  //constructors
  public ToDo(String title, String description, boolean urgent, boolean done) {
    this.title = title;
    this.description = description;
    this.urgent = urgent;
    this.done = done;
  }

  //getters and setters --> Lombok


}
