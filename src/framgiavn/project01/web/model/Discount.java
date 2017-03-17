package framgiavn.project01.web.model;

import java.util.Date;

public class Discount {
  private int id;
  private int value, type, targetId, status;
  private Date startDate, endDate;
  private String targetType;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public int getTargetId() {
    return targetId;
  }
  public void setTargetId(int targetId) {
    this.targetId = targetId;
  }
  public String getTargetType() {
    return targetType;
  }
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }
}
