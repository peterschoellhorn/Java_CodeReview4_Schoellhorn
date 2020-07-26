import java.util.ArrayList;

public class User {
  private int userId;
  private String firstName;
  private String lastName;
  private String eMail;
  private String address;
  private int zip;
  private String city;
  private String phone;
  private ArrayList<String>purchaseHistory;
  private static int tempId = 100;

  public User(String firstName, String lastName, String eMail, String address, int zip, String city, String phone) {
    this.userId=(++tempId);
    this.firstName = firstName;
    this.lastName = lastName;
    this.eMail = eMail;
    this.address = address;
    this.zip = zip;
    this.city=city;
    this.phone = phone;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ArrayList<String> getPurchaseHistory() {
    return purchaseHistory;
  }

  public void setPurchaseHistory(ArrayList<String> purchaseHistory) {
    this.purchaseHistory = purchaseHistory;
  }
}

