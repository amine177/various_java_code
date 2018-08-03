import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


public class ReplaceText {
  public static void main(String args[]) throws IOException {
    if (args.length < 4) {
      System.out.println("Arguments:\nInputFile OutputFile OldString NewString");
      System.exit(1);
    }
    File inputFile = new File(args[0]);
    File outputFile = new File(args[1]);
    try (Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile)) {
      while (input.hasNextLine()) {
        output.println(input.nextLine().replaceAll(args[2], args[3]));
      }
    }
  }
}
