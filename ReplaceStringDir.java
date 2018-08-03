import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


public class ReplaceStringDir {
  public static void main(String args[]) throws IOException {
    if (args.length < 3) {
      System.out.println("Arguments:\nDirectory OldString NewString");
      System.exit(1);
    }
    File directory = new File(args[0]);
    for (File file : directory.listFiles()) {
      if (file.isFile()) {
        try (Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(new File("tmp.txt"))) {
          while (input.hasNextLine()) {
            output.println(input.nextLine().replaceAll(args[1], args[2]));
          }
        }
        try (Scanner input = new Scanner(new File("tmp.txt"));
            PrintWriter output = new PrintWriter(file)) {
          while (input.hasNextLine())
            output.println(input.nextLine());
        }
      }
    }
  }
}
