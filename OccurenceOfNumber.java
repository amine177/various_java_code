import java.util.Scanner;
import java.util.Arrays;
public class OccuranceOfNumber {
   public static void main(String[] main) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number of elements: ");
      int n = input.nextInt();
      System.out.print("Enter integers between 1 and 100: ");
      int[] list = new int[n];
      for (int i = 0; i < n; i++) {
         list[i] = input.nextInt();
      }
      System.out.println(Arrays.toString(list));
   }
}
