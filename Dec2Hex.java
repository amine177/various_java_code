import java.util.Scanner;

public class Dec2Hex {
   public static void main(String[] args) {
      // Input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a decimal");
      int decimal = input.nextInt();
      int k = decimal;
      String hex = "";
      while ( k != 0) {
         int hexValue = k % 16;
         char hexDigit = ( hexValue <= 9 && hexValue >= 0) ? 
            (char)(hexValue + '0') :
                  (char)(hexValue - 10 + 'A');
         k /= 16;
         hex = hexDigit + hex;
      }
      System.out.print(hex);
      // Loop
      // Output
   }
}
