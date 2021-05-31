package com.greenfox.error.finder.service;

import com.greenfox.error.finder.model.User;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aze on 25/10/17.
 */
@Service
public class UserService {

  //Fields
  private ArrayList<User> users;

  //Constructors
  public UserService() {
    this.users = new ArrayList<>();
  }

  //Methods
  public ArrayList<User> getAll() {
    return users;
  }

  public void save(User user) {
    users.add(user);
  }

  public UserService service() {
    return new UserService();
  }
}
