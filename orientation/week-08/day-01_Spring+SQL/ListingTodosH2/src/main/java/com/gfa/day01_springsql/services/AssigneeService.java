package com.gfa.day01_springsql.services;

import com.gfa.day01_springsql.model.Assignee;
import com.gfa.day01_springsql.repositories.AssigneeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {

  private final AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  //Get all Assignee
/*  public List<Assignee> getAllAssignee(){
    return (List<Assignee>) assigneeRepository.findAll();
  }*/

  //Create
  public Assignee getEmptyAssignee() {
    return new Assignee();
  }

  public void createAssignee(Assignee newAssignee) {
    assigneeRepository.save(newAssignee);
  }

  //Read AssigneeList
  public List<Assignee> readAssignees() {
    return (List<Assignee>) assigneeRepository.findAll();
  }

  //Update Assignee name or email
  public Assignee getUpdatableAssignee(long assigneeId) {
    return assigneeRepository.findById(assigneeId).orElse(null); //if null!!!
  }

  public void updateAssignee(Assignee assignee, long assigneeId) {
    assignee.setId(assigneeId);
    assigneeRepository.save(assignee);
  }

  //Delete Assignee from List
  public void deleteAssigneeById(long assigneeId) {
    assigneeRepository.deleteById(assigneeId);
  }
}
