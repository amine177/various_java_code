import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ReadData {
  public static void main(String[] args)
    throws IOException {
      File file = new File("scores.txt");
      Properties x = System.getProperties();
      System.out.println(x);
      Scanner input = new Scanner(file);
      input.useDelimiter("a");
      while (input.hasNext()) {
        String name = input.next();
        String mi = input.next();
        String surname = input.next();
        int score = input.nextInt();
        System.out.println(name + " " +
                           mi + " " + 
                           surname);
      }
      input.close();
    }
}
