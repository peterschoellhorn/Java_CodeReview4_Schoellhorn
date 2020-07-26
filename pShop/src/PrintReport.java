import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintReport {

  public static void printReport(User user) {
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
      System.out.println(user.getFirstName());
      System.out.println(user.getLastName());
      System.out.println("USER ID: "+user.getUserId());
      System.out.println("GETS PRINTED TO FILE");

      file.write("ORDER HISTORY OF: ");
      file.write(user.getFirstName());
      file.write(user.getLastName());
      file.write("USER ID: "+user.getUserId());
      while (i < user.getPurchaseHistory().size()) {

        file.write(user.getPurchaseHistory().get(i).toString());
        ++i;
      }

      file.close();
      System.out.println("REPORT PRINTED SUCESSFULLY");
    } catch (IOException e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    }}


