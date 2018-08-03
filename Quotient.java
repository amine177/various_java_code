import java.util.Scanner;

public class Quotient {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter tow digits:");
    int a = input.nextInt();
    int b = input.nextInt();
    if ( b != 0)
      System.out.println(a / b);
    else
      System.out.println("Divisor can't be zero");
  }
}
