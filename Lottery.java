import java.util.Scanner;


public class Lottery {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int lottery = (int) (Math.Random() * 100);
      int guess = input.NextInt();

      if ( guess == lottery)
         System.out.println("You win 10K");

      
   }
}
