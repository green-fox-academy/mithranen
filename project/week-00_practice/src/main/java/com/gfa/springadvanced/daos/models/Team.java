package com.gfa.springadvanced.daos.models;

import com.gfa.springadvanced.dtos.TeamDTO;
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
@Table(name = "euro2020_teams")
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String teamName;
  private String isoCode;
  private String stageGroup;

  public Team() {
  }

  public Team(TeamDTO teamDTO) {
    teamName = teamDTO.getCoNm();
    isoCode = teamDTO.getCoId();
    stageGroup = teamDTO.getScd();
  }

  public Team(String teamName, String isoCode) {
    this.teamName = teamName;
    this.isoCode = isoCode;
  }
}
