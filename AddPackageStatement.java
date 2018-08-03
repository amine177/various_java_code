import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class AddPackageStatement {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: \n" +
         "java AddPackageStatement srcDir");
      System.exit(1);
    }
    File file = new File(args[0]);
    try  {
      AddPkgStatement(file);
    }
    catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  public static void AddPkgStatement(File startingDirectory) throws Exception {
    ArrayList<File> pendingDirs = new ArrayList<>();
    pendingDirs.add(startingDirectory);
    while (!pendingDirs.isEmpty()) {
      File currentDir = pendingDirs.remove(0);
      for (File fileElement : currentDir.listFiles()) {
        if (fileElement.toString().matches(".+\\.java")) {
          String[] spadd = fileElement.toString().split("\\/");
          String add = spadd[1];
          if (spadd.length > 2) {
            for (int i = 2; i < spadd.length - 1; i++)
              add = add + "." + spadd[i];
            AddNewLine(fileElement, "package " + add + ";", 0);
          }
        }
        if (fileElement.isDirectory()) {
          pendingDirs.add(fileElement);
        }
    }
    }
  }


  public static void AddNewLine(File file, String s, int lineNumber)
  throws Exception {
    Scanner input_file = new Scanner(file);
    File tmp = new File("tmp.txt");
    PrintWriter output_tmp = new PrintWriter(tmp);
    int count = 0;
    while (input_file.hasNext()) {
      String line = input_file.nextLine();
      if (count == lineNumber)
        output_tmp.println(s);
      output_tmp.println(line);
      count++;
    }
    input_file.close();
    output_tmp.close();
    Scanner input_tmp = new Scanner(tmp);
    PrintWriter output_file = new PrintWriter(file);
    while (input_tmp.hasNext())
      output_file.println(input_tmp.nextLine());
    input_tmp.close();
    output_file.close();
    }
}
