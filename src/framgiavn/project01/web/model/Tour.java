package framgiavn.project01.web.model;

import java.sql.Date;

public class Tour {
  private int id;
  private int tourMasterId;
  private String name;
  private Date startDate, finishDate;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public Date getFinishDate() {
    return finishDate;
  }
  public void setFinishDate(Date finishDate) {
    this.finishDate = finishDate;
  }
  public int getTourMasterId() {
    return tourMasterId;
  }
  public void setTourMasterId(int tourMasterId) {
    this.tourMasterId = tourMasterId;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
