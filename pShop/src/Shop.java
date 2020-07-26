import java.util.HashMap;

public class Shop {
  private String name;
  private String address;
  private int inStock;
  private static HashMap<Product, Integer> inventory;


  public Shop(String name, String address, int inStock) {
    this.name = name;
    this.address = address;
    this.inStock = inStock;
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

  public int getInStock() {
    return inStock;
  }

  public void setInStock(int inStock) {
    this.inStock = inStock;
  }

  public static HashMap<Product, Integer> getInventory() {
    return inventory;
  }

  public static void setInventory(HashMap<Product, Integer> inventory) {
    Shop.inventory = inventory;
  }
}
