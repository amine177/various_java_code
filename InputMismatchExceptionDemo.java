import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    do {
    try {
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      System.out.println("The number is: " + number);
      continueInput = false;
    }
    catch (InputMismatchException ex) {
      System.out.println("Please enter a valid number");
      input.nextLine();
    }
    } while (continueInput);
  }
}
