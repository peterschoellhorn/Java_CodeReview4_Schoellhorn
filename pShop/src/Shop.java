

import java.util.HashMap;
import java.util.Map;

public class Shop {

  private String name;
  private String address;
  private int zip;
  private String city;
  static Shop shop1 = new Shop("NEEDFUL THINGS, MAIN SHOP", "Linke Wienzeile 1, Naschmarkt", 1050, "Vienna");

  public static HashMap<Product, Integer> inventory;


  public Shop( String name, String address, int zip, String city ) {
    this.name = name;
    this.address = address;
    this.zip = zip;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
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

  public static HashMap<Product, Integer> getInventory() {
    return inventory;
  }

  public static void setInventory( HashMap<Product, Integer> inventory ) {
    Shop.inventory = inventory;
  }


  public static void addtoInventory( int id, int quantity ) throws StockLimitReachedException {
    inventory = getInventory();
    Product product = Main.productDatabase.get(id);
    int newStock = inventory.get(product) + quantity;

    if (newStock > 15) {
      inventory.put(product, (newStock - 15));
      throw new StockLimitReachedException("MAX CAPACITY REACHED!\n" +
          "ADDING " + (newStock - 15) + " INSTEAD.\n"+ "|OLD STOCK OF "
          +product+ "  |  " + inventory.get(product) +
          "|\n" + "|CURRENT STOCK OF " +product+ "  |  " + newStock + "|\n");
    } else inventory.put(product, newStock);
      System.out.println("|| PRODUCT SUCCESSFULLY ADDED TO SHOP :) ||\n");
      System.out.println("|OLD STOCK OF " +product+ "  |  " + inventory.get(product) + "|\n");
      System.out.println("|CURRENT STOCK OF " +product+ "  |  " + newStock + "|\n");
  }


  public static void checkLowStock() {

    inventory = getInventory();
    for (int i = 0; i < getInventory().size(); i++) {
      Product product = Main.productDatabase.get(i);
      int stock = inventory.get(product);
      if (stock < 5) {
        System.out.println("ATTN: " + product + " is low on Stock\n" + stock + " left");}
    }
  }
  public static void checkEmptyStock () {
    inventory = getInventory();
    for (int i = 0; i < getInventory().size(); i++) {
      Product product = Main.productDatabase.get(i);
      int stock = inventory.get(product);
      if (stock < 5) {
        System.out.println("ATTN: " + product + " is low on Stock\n" + stock + " left");}
    }
  }
  }