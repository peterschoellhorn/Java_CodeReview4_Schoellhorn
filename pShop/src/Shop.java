import java.util.HashMap;

public class Shop {

  private String name;
  private String address;
  private int zip;
  private String city;
  static Shop shop1 = new Shop("NEEDFUL THINGS, MAIN SHOP","Linke Wienzeile 1, Naschmarkt",1050,"Vienna");

  private static HashMap<Product, Integer> inventory;


  public Shop(String name, String address, int zip, String city) {
    this.name = name;
    this.address = address;
    this.zip = zip;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public static HashMap<Product, Integer> getInventory() {
    return inventory;
  }

  public static void setInventory(HashMap<Product, Integer> inventory) {
    Shop.inventory = inventory;
  }



  public static void addtoInventory(int id, int quantity) throws StockLimitReachedException {
    inventory = getInventory();
    Product product = Main.productDatabase.get(id);
    int newStock=inventory.get(product)+quantity;

      if (newStock > 15) {
        inventory.replace(product, inventory.get(product), (newStock - 15));
        throw new StockLimitReachedException("MAX CAPACITY REACHED!\n" +
            "ADDING " + (newStock - 15) + " INSTEAD.");
      } else inventory.replace(product, inventory.get(product), newStock);
    }

  }




