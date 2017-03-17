package framgiavn.project01.web.model;

public class Rating {
  private int id;
  private int tourId, userId, star;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getStar() {
    return star;
  }
  public void setStar(int star) {
    this.star = star;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public int getTourId() {
    return tourId;
  }
  public void setTourId(int tourId) {
    this.tourId = tourId;
  }
}
