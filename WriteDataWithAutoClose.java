import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WriteDataWithAutoClose {
  public static void main(String[] args) throws IOException {
    File file = new File("scores.txt");
    if (file.exists() && file.length() > 0)
      System.exit(1);

    try (PrintWriter output = new PrintWriter(file)) {
      output.print("JJJ l JJJl ");
      output.println(34);
    }
  }
}
