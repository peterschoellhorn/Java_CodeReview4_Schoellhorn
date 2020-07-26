import java.util.Scanner;

public class UserInterface {

  public userInterface() {

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
        case 2:
        case 3:
        case 4:
      }


  }

}
Main.productDatabase.forEach(Product -> System.out.println(Product.getProductName()+" ")