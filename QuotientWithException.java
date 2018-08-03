import java.util.Scanner;


public class QuotientWithException {
  public static int quotient(int a, int b) {
    if (b != 0)
      return a / b;
    else
      throw new ArithmeticException("Divisor can not be 0");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter tow ints:");
    int a = input.nextInt();
    int b = input.nextInt();
    try {
      System.out.println(a + "/" +
          b + " = " + quotient(a, b));
    }
    catch (ArithmeticException ex) {
      System.out.println("You tried to divide by 0");
    }
  }

}
