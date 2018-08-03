import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;


public class RemoveText {
  public static void main(String[] args) throws Exception {
    System.out.print("Enter file name: ");
    if (args.length < 2) {
      System.out.println("Usage: java Exercise12_11 oldString filename");
      System.exit(1);
    }
    File file = new File(args[1]);
    String lines = "";
    if (!file.exists()) {
      System.out.println("File does not exist!");
      System.exit(2);
    }
    try (Scanner input = new Scanner(file)) {
      while (input.hasNext())
        lines = lines + input.nextLine().replaceAll(args[0], "") + "\n";
      input.reset();
      System.out.print("***" + input.nextByte(0));
    }
    try (PrintWriter output = new PrintWriter(file)) {
      output.print(lines);
    }
  }
}
