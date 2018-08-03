import java.util.Scanner;

// Work on the basis that C = 5 / 9 (F - 32)
public class FahrenheitToCelsius {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println(
         "Enter a Fahrenheit degree:");
      double fahrenheitDegree = input.nextDouble();
      double celsiusDegree = 
         (fahrenheitDegree - 32) * 5 / 9;
      System.out.println(
         fahrenheitDegree + " F = " + celsiusDegree + " C");
   }
}
