import java.util.HashMap;

public class Main {

  public static void main(String[] args) {


    Shop


    Product tshirt = new Product("T-SHIRT PLAIN UNISIZE","white tshirt, v-neck, 100% cotton, plain white, unisize",19.90,
        Product.Category.CLOTHES);

    Product boots = new Product("DOC MARTENS LEATHER BOOTS, SIZE 43","doc martens leather boots, hightop, black " +
        "leather, impregnated, size 43",199.00, Product.Category.SHOES);

    Product sunglasses = new Product("RAYBAN AVIATOR SUNGLASSES, SILVER/BLACK","rayban, model: aviator; black tinted," +
        "frame: silver; uv-protection",129.00, Product.Category.ACCESSORIES);

    Product watch = new Product("CASIO G-SHOCK","wristwatch: casio gbx-100-2er; model 2019; color: indigo", 149,
        Product.Category.OTHER);

    HashMap<Integer, Product> productDatabase = new HashMap<>();
      productDatabase.put(tshirt.getProductId(),tshirt);
      productDatabase.put(boots.getProductId(),boots);
      productDatabase.put(sunglasses.getProductId(),sunglasses);
      productDatabase.put(watch.getProductId(),watch);



    User user1 = new User("Peter","Schoellhorn","peter@schoellhorn.at","Obere Amtshausgasse 20",1050,"Vienna",
        "+436769683084");
    User user2 = new User ("Suzanne","C.","sz@gmail.com","Fendigasse",1050,"Vienna","NOT PROVIDED");

    HashMap<Integer, User> customerDatabase = new HashMap<>();
      customerDatabase.put(user1.getUserId(),user1);
      customerDatabase.put(user2.getUserId(),user2);

  }
}



