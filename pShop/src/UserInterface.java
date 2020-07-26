import java.lang.reflect.Array;
import java.util.*;

public class UserInterface {



  public userInterface( HashMap<Integer, Product> productDatabase, Product product, Product Category, Shop shop1) {

    String menu=

    "+---------------------------------------------+\n" +
    "|       BACKEND SHOP ADMIN SYSTEM V 0.9       |\n" +
    "|---------------------------------------------|\n" +
    "|                   WELCOME                   |\n" +
    "|---------------------------------------------|\n" +
    "|                   OPTIONS                   |\n" +
    "|---------------------------------------------|\n" +
    "| 1) DISPLAY ALL PRODUCTS                     |\n" +
    "| 2) DISPLAY ALL PRODUCTS FROM CATEGORY (X)   |\n" +
    "| 3) DISPLAY ALL PRODUCTS LOW ON STOCK (<5)   |\n" +
    "| 4) DISPLAY ALL PRODUCTS OUT OF STOCK        |\n" +
    "| 0) EXIT SYSTEM                              |\n" +
    "|---------------------------------------------|\n" +
    "| SELECT (0 -4) AND PRESS <ENTER> TO PROCEED  |\n" +
    "+---------------------------------------------+";

    int EXIT=0;
    int DISPLAY_ALL=1;
    int DISPLAY_CATEGORY=2;
    int DISPLAY_LOWONSTOCK=3;
    int DISPLAY_OUTOFSTOCK=4;

    boolean toContinue = true;

    while(toContinue){
      System.out.println(menu);
      Scanner inputScanner = new Scanner(System.in);
      int input = inputScanner.nextInt();
      switch(input){
        case 0:
          System.out.println("PROGRAM CLOSED");
          toContinue = false;
          break;
        case 1:
          System.out.println("LIST OF ALL PRODUCTS");
          for(int i : productDatabase.keySet()){
            System.out.println(productDatabase.get(i).toString());
          }
          break;
        case 2:
          System.out.println("CHOOSE CATEGORY: ");
          System.out.println("1)   "+(Product.Category.CLOTHES.toString()));
          System.out.println("2)   "+(Product.Category.SHOES.toString()));
          System.out.println("3)   "+(Product.Category.EYEWEAR.toString()));
          System.out.println("4)   "+(Product.Category.OTHER.toString()));
          int category = inputScanner.nextInt();
          if (category==1){
            for (int i = 0; i < Product.clothes.size(); i++) System.out.println(Product.clothes.get(i).toString());
          }
          if (category==2){
            for (int i = 0; i < Product.shoes.size(); i++) System.out.println(Product.shoes.get(i).toString());
          }
          if (category==3){
            for (int i = 0; i < Product.eyewear.size(); i++) System.out.println(Product.eyewear.get(i).toString());
          }
          if (category==4){
            for (int i = 0; i < Product.other.size(); i++) System.out.println(Product.other.get(i).toString());
          }
        case 3:

          for (int i = 0; i < Shop.getInventory().size(); i++)
            if((Shop.getInventory().get(i))<5) System.out.println(Shop.getInventory()..)

          int stock2 =Integer.parseInt(stock1);
           {


          System.out.println();
          }
        case 3:
        case 4:
      }



    }

    }
  }

}
Main.productDatabase.forEach(Product -> System.out.println(Product.getProductName()+" ")