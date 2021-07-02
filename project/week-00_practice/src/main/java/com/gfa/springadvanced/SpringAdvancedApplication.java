package com.gfa.springadvanced;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfa.springadvanced.services.Euro2020ServiceImp;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdvancedApplication {

/*  private Euro2020ServiceImp serviceImp;

  @Autowired
  public SpringAdvancedApplication(Euro2020ServiceImp serviceImp) {
    this.serviceImp = serviceImp;
  }*/

  public static void main(String[] args) {
    SpringApplication.run(SpringAdvancedApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//
///*
//    System.out.println(serviceImp.getTeamData());
//*/

   /* HttpResponse<String> response = Unirest.get(
        "https://livescore6.p.rapidapi.com/matches/v2/list-by-league?Category=soccer&Ccd=euro-2020")
        .header("x-rapidapi-key", "0b8349f53amsh56eb5801e05e4fep151a15jsna5b1eb552516")
        .header("x-rapidapi-host", "livescore6.p.rapidapi.com")
        .asString();

    ObjectMapper mapper = new ObjectMapper();
    JsonNode data = mapper.readTree(response.getBody());

    int sizeOfStage = data.get("Stages").size();

    for (int i = 0; i < sizeOfStage; i++) {
      int sizeOfEvent = data.get("Stages").get(i).get("Events").size();
      for (int j = 0; j < sizeOfEvent; j++) {
        int sizeOfT2 = data.get("Stages").get(i).get("Events").get(j).get("T2").size();
        for (int k = 0; k < sizeOfT2; k++) {
          String teamName = data.get("Stages").get(i).get("Events").get(j).get("T2").get(k)
              .get("CoNm")
              .asText();
          String teamIsoCode = data.get("Stages").get(i).get("Events").get(j).get("T2").get(k)
              .get("CoId")
              .asText();
          if (!serviceImp.isTeamExist(teamName, teamIsoCode) && (!teamName.equals("International")
              || !teamIsoCode.equals("NON"))) {
            serviceImp.saveNewTeam(teamName, teamIsoCode);
          }
        }
      }
    }

    for (int i = 0; i < sizeOfStage; i++) {
      int sizeOfEvent = data.get("Stages").get(i).get("Events").size();
      for (int j = 0; j < sizeOfEvent; j++) {
        int sizeOfT1 = data.get("Stages").get(i).get("Events").get(j).get("T1").size();
        for (int k = 0; k < sizeOfT1; k++) {
          String teamName = data.get("Stages").get(i).get("Events").get(j).get("T1").get(k)
              .get("CoNm")
              .asText();
          String teamIsoCode = data.get("Stages").get(i).get("Events").get(j).get("T1").get(k)
              .get("CoId")
              .asText();
          if (!serviceImp.isTeamExist(teamName, teamIsoCode) && (!teamName.equals("International")
              || !teamIsoCode.equals("NON"))) {
            serviceImp.saveNewTeam(teamName, teamIsoCode);
          }
        }
      }
    }
*/
}

