import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TestFileClass {
  public static void main(String[] args) throws IOException {
    File file = new File("image/us.gif");
    System.out.println(file.exists());
    System.out.println(file.length());
    System.out.println(file.isAbsolute());
    System.out.println(file.lastModified());
    System.out.println(file.getAbsolutePath());
    File f = new File("y");
    f.mkdir();
  }
}
