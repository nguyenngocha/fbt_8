package framgiavn.project01.web.model;

import java.sql.Date;

public class BookingRequest {
  private int id;
  private int tourId, userId, bookingNumber;
  private Date startDate, finishDate;

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
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public int getBookingNumber() {
    return bookingNumber;
  }
  public void setBookingNumber(int bookingNumber) {
    this.bookingNumber = bookingNumber;
  }
  public Date getFinishDate() {
    return finishDate;
  }
  public void setFinishDate(Date finishDate) {
    this.finishDate = finishDate;
  }
  public int getTourId() {
    return tourId;
  }
  public void setTourId(int tourId) {
    this.tourId = tourId;
  }
}
