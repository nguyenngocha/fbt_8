package framgiavn.project01.web.model;

public class Activity {
  private int id;
  private int userId, targetId;
  private String targetName, actionName;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public int getTargetId() {
    return targetId;
  }
  public void setTargetId(int targetId) {
    this.targetId = targetId;
  }
  public String getTargetName() {
    return targetName;
  }
  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }
  public String getActionName() {
    return actionName;
  }
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }
}
