import java.util.Scanner;


public class ScannerTest {
  public static void main(String[] args) {
    Scanner x = new Scanner("12 3");
    System.out.println(x.nextInt() + " " + x.nextInt());
  }
}
