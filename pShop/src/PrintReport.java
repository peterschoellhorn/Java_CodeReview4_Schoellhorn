import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintReport {

  public static void printReport(int userId) {
    User customer=Main.customerDatabase.get(userId);
    try {
      File file = new File("C:\\file.txt");
      if (file.createNewFile()) {
        System.out.println("FILE CREATED: " + file.getName());
      } else {
        System.out.println("FILE ALREADY EXISTS");
      }
    } catch (Exception e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    try {
      FileWriter file = new FileWriter("C:\\file.txt");
      int i = 0;
      System.out.println("ORDER HISTORY OF: ");
      System.out.println(customer.getFirstName());
      System.out.println(customer.getLastName());
      System.out.println("USER ID: " + customer.getUserId());
      System.out.println("GETS PRINTED TO FILE");

      file.write("ORDER HISTORY OF: ");
      file.write(customer.getFirstName());
      file.write(customer.getLastName());
      file.write("USER ID: " + customer.getUserId());
      while (i < User.purchaseHistory.size()) {

        file.write(customer.getPurchaseHistory().get(i).toString());
        ++i;
      }

      file.close();
      System.out.println("REPORT PRINTED SUCESSFULLY");
    } catch (IOException e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }

  public static void displayOrderHistory(int userId ) {
    User customer=Main.customerDatabase.get(userId);
    try {
      File file = new File("C:\\file.txt");
      if (file.createNewFile()) {
        System.out.println("FILE CREATED: " + file.getName());
      } else {
        System.out.println("FILE ALREADY EXISTS");
      }
    } catch (Exception e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    try {
      FileWriter file = new FileWriter("C:\\file.txt");
      int i = 0;
      System.out.println("ORDER HISTORY OF: ");
      System.out.println(customer.getFirstName());
      System.out.println(customer.getLastName());
      System.out.println("USER ID: " + customer.getUserId());
      System.out.println("GETS PRINTED TO FILE");

      file.write("ORDER HISTORY OF: ");
      file.write(customer.getFirstName());
      file.write(customer.getLastName());
      file.write("USER ID: " + customer.getUserId());
      while (i < customer.getPurchaseHistory().size()) {

        file.write(User.purchaseHistory.get(i).toString()+"\n");
        i++;
      }

      file.close();
      System.out.println("REPORT PRINTED SUCCESSFULLY");
    } catch (IOException e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
}
