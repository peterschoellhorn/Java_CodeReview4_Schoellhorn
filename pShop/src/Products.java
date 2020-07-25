import java.util.EnumSet;

public class Products {
  int productId;
  static int tempId = 0;
  String productName;
  String productDescription;
  float productPrice;
  String productCategory;
  public enum Category{


    CLOTHES,
    SHOES,
    ACCESSORIES,
    OTHER,}


  EnumSet category= EnumSet.of(Category.CLOTHES, Category.SHOES, Category.ACCESSORIES, Category.OTHER);

/*  public enum Category {


    CLOTHES ("clothes"),
    SHOES ("shoes"),
    ACCESSOIRES ("accesoires"),
    OTHER ("other")
    ;
    private final String category;
    private Category(String category){
      this.category=category;
    }
    public String getCategory() {
      return this.category;
    }*/

  public Products(String productName, String productDescription, float productPrice) {
    this.productId=(++tempId);
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productCategory=Category.valueOf(productCategory);
  }

  void addProduct(int productId){

  }
}
