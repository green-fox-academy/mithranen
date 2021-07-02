package com.gfa.springadvanced.services;

import com.gfa.springadvanced.daos.LiveScoreAPI;
import com.gfa.springadvanced.dtos.InputDTO;
import com.gfa.springadvanced.dtos.TeamDTO;
import com.gfa.springadvanced.daos.models.Team;
import com.gfa.springadvanced.repositories.TeamRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class Euro2020ServiceImp implements Euro2020Service {


  private final TeamRepository teamRepository;
  private final LiveScoreAPI liveScoreAPI;


  @Autowired
  public Euro2020ServiceImp(TeamRepository teamRepository) {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://livescore6.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    this.teamRepository = teamRepository;
    this.liveScoreAPI = retrofit.create(LiveScoreAPI.class);
  }

  public void saveNewTeam(String teamName, String isoCode) {
    teamRepository.save(new Team(teamName, isoCode));
  }

  public void saveTeams(List<TeamDTO> inputList) {
    for (TeamDTO teamDTO : inputList) {
      teamRepository.save(new Team(teamDTO));
    }
  }

  public boolean isTeamExist(String teamName, String isoCode) {
    return teamRepository.existsByTeamNameAndIsoCode(teamName, isoCode);
  }

  public InputDTO getEuro2020DataFrom3thPartyAPI(String Category, String Ccd) {
    try {
      return liveScoreAPI.getEuro2020Data(Category, Ccd).execute().body();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public List<TeamDTO> getTeamData(InputDTO inputDTO) {
    List<TeamDTO> outputList = new ArrayList<>();

    for (int i = 0; i < inputDTO.getStages().size(); i++) {
    TeamDTO teamDTO = new TeamDTO();
      teamDTO.setScd(inputDTO.getStages().get(i).getScd());

      int sizeOfEventDTO = inputDTO.getStages().get(i).getEvents().size();

      for (int j = 0; j < sizeOfEventDTO; j++) {

        int sizeOfT1 = inputDTO.getStages().get(i).getEvents().get(j).getT1().size();
        int sizeOfT2 = inputDTO.getStages().get(i).getEvents().get(j).getT2().size();

        if (inputDTO.getStages().get(i).getEvents().get(j).getT1() != null) {
          for (int k = 0; k < sizeOfT1; k++) {
/*            if (!teamRepository.existsByTeamName(
                inputDTO.getStages().get(i).getEvents().get(j).getT1().get(k).getCoNm())
                && (!inputDTO.getStages().get(i).getEvents().get(j).getT1().get(k).getCoNm()
                .equals("International")))*/
            String teamName = inputDTO.getStages().get(i).getEvents().get(j).getT2().get(k).getCoNm();
            if (validateTeamName(teamName)){

              teamDTO.setCoNm(inputDTO.getStages().get(i)
                  .getEvents().get(j).getT1().get(k).getCoNm());
              teamDTO.setCoId(inputDTO.getStages()
                  .get(i).getEvents().get(j).getT1().get(k).getCoId());
              outputList.add(teamDTO);

            } else if (!teamRepository.existsByTeamName(
                inputDTO.getStages().get(i).getEvents().get(j).getT2().get(k).getCoNm())
                && (!inputDTO.getStages().get(i).getEvents().get(j).getT2().get(k).getCoNm()
                .equals("International"))) {

              teamDTO.setCoNm(inputDTO.getStages().get(i)
                  .getEvents().get(j).getT2().get(k).getCoNm());
              teamDTO.setCoId(inputDTO.getStages()
                  .get(i).getEvents().get(j).getT2().get(k).getCoId());
              outputList.add(teamDTO);
            }
          }
        }
      }
    }

    return outputList;
  }

  public boolean validateTeamName(String teamName) {
    if (!teamName.equals("International") && !teamRepository.existsByTeamName(teamName)) {
      return true;
    }
    return false;
  }
//    public List<TeamDTO> getAllTeamData () {
//      List<TeamDTO> outputList = new ArrayList<>();
//
//      InputDTO inputDTO = getInputDTOData();
//      List<StageDTO> stageDTOList = getStageDTOData(inputDTO);
//      List<EventDTO> eventDTOList = getEventDTOData(stageDTOList);
//      outputList = getTeamDTODataFromEventList(eventDTOList);
//
//      return outputList;
//    }
//
//    private InputDTO getInputDTOData () {
//      try {
//        return liveScoreAPI.getEuro2020Datas("soccer", "euro-2020").execute().body();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//      return null;
//    }
//
//    private List<StageDTO> getStageDTOData (InputDTO inputDTO){
//      List<StageDTO> outputList = new ArrayList<>();
//
//      for (int i = 0; i < inputDTO.getStages().size(); i++) {
//        outputList.add(inputDTO.getStages().get(i));
//      }
//      return outputList;
//    }
//
//    private List<EventDTO> getEventDTOData (List < StageDTO > stageDTOList) {
//      List<EventDTO> outputList = new ArrayList<>();
//
//      for (int i = 0; i < stageDTOList.size(); i++) {
//        outputList.add((EventDTO) stageDTOList.get(i).getEvents());
//      }
//      return outputList;
//    }
//
//    private List<TeamDTO> getTeamDTODataFromEventList (List < EventDTO > eventDTOList) {
//      List<TeamDTO> outputList = new ArrayList<>();
//      for (int i = 0; i < eventDTOList.size(); i++) {
//        if (!eventDTOList.get(i).getT1().isEmpty()) {
//          outputList.add((TeamDTO) eventDTOList.get(i).getT1());
//        } else {
//          outputList.add((TeamDTO) eventDTOList.get(i).getT2());
//        }
//      }
//      return outputList;
//    }

}
