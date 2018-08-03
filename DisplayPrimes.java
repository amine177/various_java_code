import java.util.Scanner;

public class DisplayPrimes {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number:");
      int number = input.nextInt();
      StackOfIntegers stack = new StackOfIntegers();
      for (int i = 1; i <= number; ++i) {
         if (isPrime(i))
            stack.push(i);
      }
      
      while(!stack.empty())
         System.out.print(stack.pop() + " ");
   }

   public static boolean isPrime(int x) {
      for (int i = 2; i <= Math.pow(x, 0.5); ++i)
         if (x % i == 0)
            return false;
      return true;
   }
}
