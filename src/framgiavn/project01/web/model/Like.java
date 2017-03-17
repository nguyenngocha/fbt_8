package framgiavn.project01.web.model;

public class Like {
  private int id;
  private int reviewId, userId;

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
  public int getReviewId() {
    return reviewId;
  }
  public void setReviewId(int reviewId) {
    this.reviewId = reviewId;
  }
}
