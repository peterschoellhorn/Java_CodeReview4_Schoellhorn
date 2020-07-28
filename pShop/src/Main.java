import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static HashMap<Integer, User> customerDatabase = new HashMap<>();
  public static HashMap<Integer, Product> productDatabase = new HashMap<>();
  public static ArrayList<Product> clothes =new ArrayList<>();





  public static void createProductDatabase() {
    Product tshirt =
        new Product("T-SHIRT PLAIN UNISIZE", "white tshirt, v-neck, 100% cotton, plain white, unisize", 19.90,
            Product.Category.CLOTHES);

    Product tshirt2 =
        new Product("T-SHIRT DARKBLUE UNISIZE", "blue tshirt, round-neck, 100% cotton, dark blue, unisize", 29.90,
            Product.Category.CLOTHES);

    Product boots = new Product("DOC MARTENS LEATHER BOOTS, SIZE 43", "doc martens leather boots, hightop, black " +
        "leather, impregnated, size 43", 199.00, Product.Category.SHOES);

    Product sunglasses =
        new Product("RAYBAN AVIATOR SUNGLASSES, SILVER/BLACK", "rayban, model: aviator; black tinted," +
            "frame: silver; uv-protection", 129.00, Product.Category.EYEWEAR);

    Product watch = new Product("CASIO G-SHOCK", "wristwatch: casio gbx-100-2er; model 2019; color: indigo", 149,
        Product.Category.OTHER);

    Product watch2 = new Product("Glashütte ShowOff5000", "wristwatch: Glashütte ShowOff5000; model 1999; color: " +
        "solid white gold, saphirre",
        11149,
        Product.Category.OTHER);





    productDatabase.put(tshirt.getProductId(),tshirt);
    productDatabase.put(boots.getProductId(),boots);
    productDatabase.put(sunglasses.getProductId(),sunglasses);
    productDatabase.put(watch.getProductId(),watch);
    productDatabase.put(tshirt2.getProductId(),tshirt2);
    productDatabase.put(watch2.getProductId(),watch2);
  }

  public static void createCustomerDatabase(){
    User user1 = new User("Peter","Schoellhorn","peter@schoellhorn.at","Obere Amtshausgasse 20",1050,"Vienna",
        "+436769683084");
    User user2 = new User ("Suzanne","C.","sz@gmail.com","Fendigasse",1050,"Vienna","NOT PROVIDED");


    customerDatabase.put(user1.getUserId(),user1);
    customerDatabase.put(user2.getUserId(),user2);

  }


  public static void main(String[] args) throws StockLimitReachedException {

    Main.createProductDatabase();
    Main.createCustomerDatabase();
    UserInterface inteface=new UserInterface();
    inteface.userInterface(productDatabase,Shop.inventory, User.purchaseHistory, customerDatabase);
}}



