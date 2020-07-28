import java.lang.reflect.Array;
import java.util.*;

public class UserInterface {



  public void userInterface( HashMap<Integer, Product> productDatabase, HashMap<Product, Integer> inventory,
                        ArrayList<Product>purchaseHistory,Product Category) throws StockLimitReachedException {

    String menu =

        "+---------------------------------------------+\n" +
            "|       BACKEND SHOP ADMIN SYSTEM V 0.9       |\n" +
            "|---------------------------------------------|\n" +
            "|                   WELCOME                   |\n" +
            "|---------------------------------------------|\n" +
            "|                   OPTIONS                   |\n" +
            "|---------------------------------------------|\n" +
            "|                                             |\n" +
            "| 1) DISPLAY ALL PRODUCTS                     |\n" +
            "| 2) DISPLAY ALL PRODUCTS FROM CATEGORY (X)   |\n" +
            "| 3) DISPLAY ALL PRODUCTS LOW ON STOCK (<5)   |\n" +
            "| 4) DISPLAY ALL PRODUCTS OUT OF STOCK        |\n" +
            "| 5) CREATE NEW PRODUCT FOR DATABASE          |\n" +
            "| 6) ADD PRODUCT FROM DATABASE TO SHOP        |\n" +
            "| 7) CREATE NEW CUSTOMER                      |\n" +
            "| 8) VIEW ORDER HISTORY (CUSTOMER)            |\n" +
            "| 9) PRINT ORDER HISTORY FROM (CUSTOMER)      |\n" +
            "| 0) EXIT SYSTEM                              |\n" +
            "|                                             |\n" +
            "|---------------------------------------------|\n" +
            "| SELECT (0 -9) AND PRESS <ENTER> TO PROCEED  |\n" +
            "+---------------------------------------------+";

    String subMenu =

        "+---------------------------------------------+\n" +
            "|       BACKEND SHOP ADMIN SYSTEM V 0.9       |\n" +
            "|---------------------------------------------|\n" +
            "|                                             |\n" +
            "|---------------------------------------------|\n" +
            "|               CHOOSE CATEGORY               |\n" +
            "|---------------------------------------------|\n" +
            "|                                             |\n" +
            "| 1) DISPLAY ALL PRODUCTS (CLOTHES)           |\n" +
            "| 2) DISPLAY ALL PRODUCTS (SHOES)             |\n" +
            "| 3) DISPLAY ALL PRODUCTS (EYEWEAR)           |\n" +
            "| 4) DISPLAY ALL PRODUCTS (OTHER)             |\n" +
            "| 0) EXIT                                     |\n" +
            "|                                             |\n" +
            "|                                             |\n" +
            "|                                             |\n" +
            "|                                             |\n" +
            "|                                             |\n" +
            "|                                             |\n" +
            "|---------------------------------------------|\n" +
            "| SELECT (0 -4) AND PRESS <ENTER> TO PROCEED  |\n" +
            "+---------------------------------------------+";


    int EXIT = 0;
    int DISPLAY_ALL = 1;
    int DISPLAY_CATEGORY = 2;
    int DISPLAY_LOWONSTOCK = 3;
    int DISPLAY_OUTOFSTOCK = 4;
    int CREATE_PRODUCT = 5;
    int ADD_TO_SHOP = 6;
    int CREATE_CUSTOMER = 7;
    int VIEW_HISTORY = 8;
    int PRINT_HISTORY = 9;

    boolean toContinue = true;

    while (toContinue) {
      System.out.println(menu);
      Scanner inputScanner = new Scanner(System.in);
      int input = inputScanner.nextInt();
      switch (input) {
        case 0:
          System.out.println("PROGRAM CLOSED");
          toContinue = false;
          break;
        case 1:
          System.out.println("LIST OF ALL PRODUCTS");
          for (int i : productDatabase.keySet()) {
            System.out.println("*"+productDatabase.get(i).toString()+"\n");
          }
          break;
        case 2:
          int CLOTHES = 1;
          int SHOES = 2;
          int EYEWEAR = 3;
          int OTHER = 4;
          System.out.println(subMenu);
          inputScanner=new Scanner(System.in);
          int subInput = inputScanner.nextInt();
          switch (input) {
            case 1:
              System.out.println(Product.Category.CLOTHES.toString());
            case 2:
              System.out.println(Product.Category.SHOES.toString());
            case 3:
              System.out.println(Product.Category.EYEWEAR.toString());
            case 4:
              System.out.println(Product.Category.OTHER.toString());
            inputScanner.close();
            break;
          }
        case 3:
          Shop.checkLowStock();
          break;
        case 4:
          Shop.checkEmptyStock();
          break;
        case 5:
          System.out.println("|ADD PRODUCT TO DATABASE - PLEASE ENTER NAME OF PRODUCT| \n");
          inputScanner=new Scanner(System.in);
          String productName = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER PRODUCT DESCRIPTION AND PRESS ENTER| \n");
          String productDescription = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER PRODUCT PRICE IN FORMAT (X)X.XX | \n");
          double productPrice = inputScanner.nextDouble();
          System.out.println("|TYPE CATEGORY AND PRESS ENTER: *) CLOTHES | *) SHOES | *) EYEWEAR | *) OTHER |");
          String productCategory = inputScanner.nextLine();Product.Category.valueOf(productCategory);
            new Product(productName,productDescription,productPrice,
              (Product.Category.valueOf(productCategory)));// parsing string into enum for constructor arg.
          System.out.println("|| PRODUCT SUCCESSFULLY ADDED :) ||\n");
          inputScanner.close();
          break;
        case 6:
          System.out.println("|| ADD A PRODUCT FROM DATABASE TO YOUR SHOP INVENTORY ||\n");
          System.out.println("|PLEASE ENTER ID OF THE PRODUCT YOU WANT TO ADD AND PRESS ENTER|\n");
          productDatabase.forEach((key, value) -> System.out.println(key+" | "+value+"\n"));
          inputScanner=new Scanner(System.in);
          int id = inputScanner.nextInt();
          System.out.println("|PLEASE ENTER ITEM QUANTITY YOU WANT TO ADD TO INVENTORY AND PRESS ENTER|\n");
          System.out.println("(PLEASE NOTE: MAX SPACE PER ITEM IS 15)\n");
          int quantity = inputScanner.nextInt();
            Shop.addtoInventory(id, quantity);
          inputScanner.close();
          break;

        case 7:
          System.out.println("|ADD CUSTOMER TO DATABASE - PLEASE ENTER FIRST NAME OF CUSTOMER AND PRESS ENTER| \n");
          inputScanner=new Scanner(System.in);
          String firstName = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER LAST NAME OF CUSTOMER PRESS ENTER| \n");
          String lastName = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER EMAIL OF CUSTOMER PRESS ENTER| \n");
          String eMail = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER STREET OF CUSTOMER PRESS ENTER| \n");
          String address = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER ZIP CODE OF CUSTOMER PRESS ENTER| \n");
          int zip = inputScanner.nextInt();
          System.out.println("|PLEASE ENTER CITY OF CUSTOMER PRESS ENTER| \n");
          String city = inputScanner.nextLine();
          System.out.println("|PLEASE ENTER PHONE NO. OF CUSTOMER PRESS ENTER| \n");
          String phone = inputScanner.nextLine();
            User.createUser(firstName,lastName,eMail,address,zip,city,phone);
          inputScanner.close();
          break;
        case 8:
          System.out.println("|PURCHASE HISTORY LOG (ALSO PRINTED TO FILE IN YOUR C:/ MAIN DIR| \n");
          Main.customerDatabase.forEach((key, value) -> System.out.println(key+" | "+value+"\n"));
          System.out.println("|PLEASE ENTER ID OF CUSTOMER AND PRESS ENTER| \n");
          inputScanner=new Scanner(System.in);
          int userId = inputScanner.nextInt();
          PrintReport.displayOrderHistory(userId);
          PrintReport.printReport(userId);
          inputScanner.close();
          break;
        case 9:
          System.out.println("|ADD PURCHASE| \n");
          Main.customerDatabase.forEach((key, value) -> System.out.println(key+" | "+value+"\n"));
          System.out.println("|PLEASE ENTER ID OF CUSTOMER AND PRESS ENTER| \n");
          inputScanner=new Scanner(System.in);
          int userId2 = inputScanner.nextInt();
          System.out.println("|PLEASE ENTER ID OF PURCHASED ITEM(S) AND PRESS ENTER| \n");
          productDatabase.forEach((key, value) -> System.out.println(key+" | "+value+"\n"));
          int itemId = inputScanner.nextInt();
          System.out.println("|PLEASE ENTER AMOUNT OF PURCHASED ITEM(S) AND PRESS ENTER| \n");
          int amount = inputScanner.nextInt();
          User.purchase(userId2,itemId,amount);
          inputScanner.close();
          break;
      }
    }
  }
}
