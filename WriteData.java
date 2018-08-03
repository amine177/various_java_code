import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;


public class WriteData {
  public static void main(String[] args) throws IOException {
    File file = new File("scores.txt");
    System.out.println(file.length());
    if (file.exists() && file.length() > 0)
      System.exit(1);
    PrintWriter output = new PrintWriter(file);
    output.print("John X br ");
    output.println("23");
    output.print("kjf X br ");
    output.println("3");
    output.close();
  }
}
