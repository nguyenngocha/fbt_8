package framgiavn.project01.web.model;

public class User {
  private int id;  
  private int role;
  private String name, email, phoneNumber, bankingAccount, password;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRole() {
    return role;
  }
  public void setRole(int role) {
    this.role = role;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getBankingAccount() {
    return bankingAccount;
  }
  public void setBankingAccount(String bankingAccount) {
    this.bankingAccount = bankingAccount;
  }
}
