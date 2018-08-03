import java.util.Scanner;


public class Sum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a range:");
      int low = input.nextInt();
      int high = input.nextInt();

      System.out.println(
         "Sum from " + low + " to " + high + " is " + sum(low,
            high));
   }

   public static int sum(int i, int j) {
      return 0;
   }
}
