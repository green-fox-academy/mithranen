package com.gfa.day01_springsql.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*!Add an Assignee for the Todo
    !it should have name and email as fields
    !On the main page we should have a link to List of Assignees
    where all the Assignees are listed
    we should be able to edit the name of any selected Assignee
    or remove one
    or add a new one (with the name and email)*/


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "assignee_list")
public class Assignee {

  //fields
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "assignee")
  private List<ToDo> toDos;

  //constructors
  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }


}

