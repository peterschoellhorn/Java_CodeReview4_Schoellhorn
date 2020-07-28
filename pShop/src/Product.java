import java.util.ArrayList;

public class Product {

  private int productId=0;
  private String productName;
  private String productDescription;
  private double productPrice;
  private Integer inStock;
  private final Category productCategory;
  private static int tempId = 0;

  static ArrayList<Product> clothes;
  static ArrayList<Product> shoes;
  static ArrayList<Product> eyewear;
  static ArrayList<Product> other;

  public enum Category {CLOTHES,SHOES,EYEWEAR,OTHER}

//  constructor

  public Product(String productName, String productDescription, double productPrice,
                 Category productCategory) {


    this.productId=(++tempId);
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productCategory=productCategory;

    if (this.productCategory==Category.CLOTHES)     clothes.add(this);
    if (this.productCategory==Category.SHOES)       shoes.add(this);
    if (this.productCategory==Category.EYEWEAR)     eyewear.add(this);
    if (this.productCategory==Category.OTHER)       other.add(this);

    Main.productDatabase.put(this.productId, this); // putting obj directly into hashmap without needing a refernece VAR
  }



//  get and set methods

  public int getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public int getInStock() {
    return inStock;
  }

  public void setInStock(int inStock) {
    this.inStock = inStock;
  }

  public Category getProductCategory() {
    return productCategory;
  }



}
