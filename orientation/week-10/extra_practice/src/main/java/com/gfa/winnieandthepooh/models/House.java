package com.gfa.winnieandthepooh.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@Entity
@Table(name = "houses")
public class House {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;
  private String name;
  private String color;
  private int numberOfRooms;


  @ManyToOne
  private Animal animal;

  public House() {
  }

  public House(String name, String color, int numberOfRooms) {
    this.name = name;
    this.color = color;
    this.numberOfRooms = numberOfRooms;
  }
}
