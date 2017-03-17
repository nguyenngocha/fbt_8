package framgiavn.project01.web.model;

public class Review {
  private int id;
  private int tourId, userId;
  private String name, content;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public int getTourId() {
    return tourId;
  }
  public void setTourId(int tourId) {
    this.tourId = tourId;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
}
