package AbstractsInterfaces.printable;

public class ToDo implements Printable {

  //
  //Fields
  protected String task;
  protected String priority;
  protected boolean isDone;

  //
  //Constructors
  public ToDo(String task, String priority, boolean isDone) {
    this.task = task;
    this.priority = priority;
    this.isDone = isDone;
  }

  //
  //Methods
  @Override
  public void printAllFields() {
    System.out
        .println("Task: " + task + " | " + "Priority:high " + priority + " | " + "Done: " + isDone);
  }
}