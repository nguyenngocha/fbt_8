package framgiavn.project01.web.model;

public class TourMaster {
  private int id;
  private int price, days, categoryId;
  private String name, description;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public int getDays() {
    return days;
  }
  public void setDays(int days) {
    this.days = days;
  }
}
