import java.util.Scanner;

public class QuotientWithMethod {
  public static double quotient(int a, int b) {
    if (b == 0)
      System.exit(1);
    return a / b;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println(quotient(a, b));
  }
}
