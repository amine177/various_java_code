import java.util.Scanner;
import java.util.InputMismatchException;


public class InputException {
  public static void main(String[] args) {
    System.out.println("Enter some input");
    try {
      (new Scanner(System.in)).nextInt();
    } catch (InputMismatchException ex) {
      System.out.println("Exception!");
    }
  }
}
