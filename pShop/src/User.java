import java.util.ArrayList;
import java.util.HashMap;

public class User {
  private int userId;
  private String firstName;
  private String lastName;
  private String eMail;
  private String address;
  private int zip;
  private String city;
  private String phone;
  public static ArrayList<Product> purchaseHistory;

  public User user;
  private static int tempId = 100;

  public User( String firstName, String lastName, String eMail, String address, int zip, String city, String phone ) {
    this.userId = (++tempId);
    this.firstName = firstName;
    this.lastName = lastName;
    this.eMail = eMail;
    this.address = address;
    this.zip = zip;
    this.city = city;
    this.phone = phone;

    Main.customerDatabase.put(this.getUserId(), this);
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId( int userId ) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName( String lastName ) {
    this.lastName = lastName;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail( String eMail ) {
    this.eMail = eMail;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress( String address ) {
    this.address = address;
  }

  public int getZip() {
    return zip;
  }

  public void setZip( int zip ) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity( String city ) {
    this.city = city;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone( String phone ) {
    this.phone = phone;
  }

  public ArrayList<Product> getPurchaseHistory() {
    return purchaseHistory;
  }

  public void setPurchaseHistory( ArrayList<Product> purchaseHistory ) {
    User.purchaseHistory = purchaseHistory;
  }


  public static void createCustomerDatabase() {
    User user1 = new User("Peter", "Schoellhorn", "peter@schoellhorn.at", "Obere Amtshausgasse 20", 1050, "Vienna",
        "+436769683084");
    User user2 = new User("Suzanne", "C.", "sz@gmail.com", "Fendigasse", 1050, "Vienna", "NOT PROVIDED");

    HashMap<Integer, User> customerDatabase = new HashMap<>();
    customerDatabase.put(user1.getUserId(), user1);
    customerDatabase.put(user2.getUserId(), user2);

  }

  public static void createUser( String firstName, String lastName, String eMail, String address, int zip, String city,
                                 String phone ) {
    new User(firstName, lastName, eMail, address, zip, city, phone);
    System.out.println("|| YAY, CUSTOMER SUCCESSFULLY ADDED :) ||\n");
  }

  public static void purchase( int userId, int itemId, int amount ) {
    User customer=Main.customerDatabase.get(userId);
    Product product = Main.productDatabase.get(itemId);
    purchaseHistory.add(product);

    if ((Shop.getInventory().get(product) - amount) <= 0)
      throw new ArithmeticException("SORRY, OUT OF STOCK");

    else {
      Shop.getInventory().replace(product, (Shop.getInventory().get(product) - amount));
      if ((Shop.getInventory().get(product) - amount) < 5)
        System.out.println("PURCHASED by:\n" + customer.getFirstName() + " " + customer.getLastName());
      System.out.println("ATTENTION - STOCK BELOW 5\n" + "Stock: " + (Shop.getInventory().get(product)));
    }
  }
}





/*  public static void purchase2( int id, int quantity, String lname){
    Shop.getInventory();
    Product product = Main.productDatabase.get(id);
    int newStock = Shop.getInventory().get(product) + quantity;

     purchaseHistory.add(product);

    if ((Shop.getInventory().get(item) - amount) <= 0)
      throw new ArithmeticException("SORRY, OUT OF STOCK");

    else {Shop.getInventory().replace(item, (Shop.getInventory().get(item) - amount));
    if ((Shop.getInventory().get(item) - amount) < 5)
      System.out.println("PURCHASED by:\n"+user.getFirstName()+" "+user.lastName);
    System.out.println("ATTENTION - STOCK BELOW 5\n" + "Stock: " + (Shop.getInventory().get(item)));}
}}*/

