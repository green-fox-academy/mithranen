package com.gfa.winnieandthepooh.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@Entity
@Table(name = "animals")
public class Animal {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;
  private String name;
  private int age;
  private Gender gender;

  @Column(name = "owned_houses")
  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = "animal")
  private List<House> housesOfAnimal;

  public Animal() {
    housesOfAnimal = new ArrayList<>();
  }

  public Animal(String name, int age, Gender gender) {
    this();
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void addHouse(House house) {
    housesOfAnimal.add(house);
    house.setAnimal(this);
  }
}
