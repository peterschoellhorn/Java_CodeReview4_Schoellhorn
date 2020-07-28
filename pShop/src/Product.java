import java.util.ArrayList;

public class Product {

  private final int productId;
  private String productName;
  private String productDescription;
  private double productPrice;
  private Integer inStock;
  public Category productCategory;
  private static int tempId = 0;

  public static ArrayList<Product> clothes;
  public static ArrayList<Product> shoes;
  public static ArrayList<Product> eyewear;
  public static ArrayList<Product> other;


  public enum Category {CLOTHES,SHOES,EYEWEAR,OTHER}

  public static void createSortArrays() {

    clothes = new ArrayList<>();
    shoes = new ArrayList<>();
    eyewear = new ArrayList<>();
    other = new ArrayList<>();
  }

//  constructor

  public Product(String productName, String productDescription, double productPrice, Category productCategory) {


    this.productId=(++tempId);
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productCategory=productCategory;

    if (this.productCategory==Category.CLOTHES) {clothes.add(this);}
    if (this.productCategory==Category.SHOES)   {shoes.add(this);}
    if (this.productCategory==Category.EYEWEAR) {eyewear.add(this);}
    if (this.productCategory==Category.OTHER)   {other.add(this);}

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
