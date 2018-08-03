import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class FileTest {
  public static void main(String[] args) throws Exception {
    File file = new File("scores.txt");
    File file1 = new File("/home/aminos/code/java/scores.txt");
    System.out.println(file == file1);
    System.out.println("file.getName():\n" + file.getName() );
    System.out.println("file1.getName():\n" + file1.getName() );
    File current = new File(".");
    File[] fl = current.listFiles();
    current.mkdir();
    System.out.println(Arrays.toString(fl));
    PrintWriter p = new PrintWriter(file);
    p.write("hi\n");
    p.close();
  }
}
