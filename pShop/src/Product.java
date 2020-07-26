public class Product {

  private int productId;
  private String productName;
  private String productDescription;
  private double productPrice;
  private int inStock;
  private final Category productCategory;
  private static int tempId = 0;



  public enum Category {CLOTHES,SHOES,ACCESSORIES,OTHER}

//  constructor

  public Product(String productName, String productDescription, double productPrice,
                 Category productCategory) {

    int newAmount=(Shop.inventory.get(this) + inStock);
    if (newAmount>15) {
      throw new ArithmeticException("Max stock capacity reached, please add no more than: " + (15 - newAmount));
    }
    Shop.inventory.replace(this, newAmount);

    this.productId=(++tempId);
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productCategory=productCategory;



  }

//  get and set methods

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
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
