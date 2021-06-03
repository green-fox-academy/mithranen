package com.gfa.day01_springsql.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

  @ManyToOne(cascade = CascadeType.PERSIST)
  private Assignee assignee;

  //constructors
  public ToDo(Assignee assignee) {
    this.assignee = assignee;
  }

  public ToDo(String title, String description, boolean urgent, boolean done) {
    this.title = title;
    this.description = description;
    this.urgent = urgent;
    this.done = done;
  }

  public ToDo(String title, String description, boolean urgent, boolean done,
      Assignee assignee) {
    this.title = title;
    this.description = description;
    this.urgent = urgent;
    this.done = done;
    this.assignee = assignee;
  }

  //getters and setters --> Lombok


}
