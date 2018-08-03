import java.util.Scanner;

public class DisplayPrimeFactors {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int x = input.nextInt();
      StackOfIntegers stack = new StackOfIntegers();
      int i = 2;
      while (x / i != 0) {
         if (x % i == 0) {
            stack.push(i);
            x /= i;
         }
         else i++;
      }

      while(!stack.empty())
         System.out.print(stack.pop() + " ");
   }
}
