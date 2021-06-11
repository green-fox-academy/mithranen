package com.gfa.groot.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class GuardianControllerTest {



  @Autowired
  MockMvc mockMvc;

  //Groot testing
  //  With giving a parameter:
  //  the status is ok
  //  the given response is the same as expected
  @Test
  public void getGrootMessageReceiveRightMessageGivingParameter() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("received").value("somemessage"))
        .andExpect(jsonPath("translated").value("I am Groot!"));
  }

  //Without giving a parameter:
  //  the status is not ok
  //  the given error response is the same as expected
  @Test
  public void getGrootMessageReceiveRightMessageNoParameter() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error").value("I am Groot!"));
  }

  //Yondu's Arrow
  //  With giving a parameter the status is ok,
  //  and the given response is the same as expected
  //  That without giving a parameter the status is not ok,
  //  and the given error response is the same as expected
  @Test
  public void calculateArrowOfYondu_RightHTTPStatus_WithRequestParameters() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("speed").value(10));
  }

  @Test
  public void calculateArrowOfYondu_RightHTTPStatus_WithNoRequestParameters() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("error").value("I AM GROOOT!"));
  }

  @Test
  public void calculateArrowOfYondu_RightHTTPStatus_WithZeroTimeRequestParameters()
      throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("speed").value("Infinity"));
  }

  //Rora's Cargo
  //Test: The overall status of the ship
  @Test
  public void displayShipStatusIsCorrectWithNoParameters()
      throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("empty"))
        .andExpect(jsonPath("$.ready", is(false)))
        .andExpect(jsonPath("$.caliber50").value(0));
  }

  //The status when you fill some items
  @Test
  public void displayShipStatusIsCorrectWithAmmoParameters()
      throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=7500"));
    mockMvc.perform(get("/rocket/fill?caliber=.30&amount=5000"));
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("full"))
        .andExpect(jsonPath("$.ready", is(true)))
        .andExpect(jsonPath("$.caliber50").value(7500))
        .andExpect(jsonPath("$.caliber30").value(5000))
        .andExpect(jsonPath("$.caliber25").value(0));
  }

  //  That without giving a parameter the status is not ok,
  //  and the given error response is the same as expected

  //That the shipstatus is:
  //"empty" when its 0%
  //"40%" when its 40%
  //"full" when its 100%


  //"overloaded" when its above 100%
  @Test
  public void displayShipStatusIsCorrectIfShipOverloaded()
      throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"));
    mockMvc.perform(get("/rocket/fill?caliber=.30&amount=5000"));
    mockMvc.perform(get("/rocket/fill?caliber=.25&amount=5000"));
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("overloaded"))
        .andExpect(jsonPath("$.ready", is(false)))
        .andExpect(jsonPath("$.caliber50").value(5000));
  }
}
