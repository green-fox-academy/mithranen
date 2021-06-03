package com.gfa.day01_springsql.controllers;

import com.gfa.day01_springsql.model.Assignee;
import com.gfa.day01_springsql.services.MainService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Getter
@Setter
@Controller
@RequestMapping("/todo")
public class AssigneeController {

  private MainService mainService;

  @Autowired
  public AssigneeController(MainService mainService) {
    this.mainService = mainService;
  }

  //Read AssigneeList
  @RequestMapping(path = {"/assignee-list"}, method = RequestMethod.GET)
  public String listingAssignees(Model model) {
    model.addAttribute("assignees", mainService.readAssignees());
    return "assignee-list";
  }

  //Delete from AssigneeList
  @RequestMapping(path = {"/delete/{assigneeId}"}, method = RequestMethod.POST)
  public String deleteFromAssignees(@PathVariable(name = "assigneeId") long assigneeId) {
    mainService.deleteAssigneeById(assigneeId);
    return "redirect:/todo/assignee-list"; //unique entire path is needed!!!
  }

  //Update Assignee
  @RequestMapping(path = {"/update-assignee/{assigneeId}"}, method = RequestMethod.GET)
  public String displayUpdatableAssignee(Model model,
      @PathVariable(name = "assigneeId") long assigneeId) {
    model.addAttribute("assignee", mainService.getUpdatableAssignee(assigneeId));
    model.addAttribute("update", "update");
    return "manage-assignee";
  }

  @RequestMapping(path = {"/update-assignee/{assigneeId}"}, method = RequestMethod.POST)
  public String updateAssignee(@ModelAttribute Assignee assignee, @PathVariable long assigneeId) {
    //assigneeRepository.findById(assigneeId).get().setId(assigneeId);
    mainService.updateAssignee(assignee, assigneeId);
    return "redirect:/todo/assignee-list";
  }

  //Create Assignee
  @RequestMapping(path = {"/create-assignee"}, method = RequestMethod.GET)
  public String displayCreatableAssignee(Model model) {
    model.addAttribute("assignee", mainService.getEmptyAssignee());
    model.addAttribute("create", "create");
    return "create-assignee";
  }

  @RequestMapping(path = {"/create-assignee"}, method = RequestMethod.POST)
  public String createAssignee(@ModelAttribute Assignee newAssignee) {
    mainService.createAssignee(newAssignee); //!!main service method!!
    return "redirect:/todo/assignee-list";
  }


}
