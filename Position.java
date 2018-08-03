import java.util.Arrays;
import java.util.Scanner;

public class Position {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] list = new int[10];
      System.out.print("Enter ten numbers: ");
      int p = 0;
      for (int i = 0;  i < 10 ; ++i) {
         boolean found = false;
         int x = input.nextInt();
         for (int j = 0; j < i; j++)
            if (found = (list[j] == x)) {
               break;
            }
         if (!found)
            list[p++] = x;

      }
      int[] list1 = Arrays.copyOf(list, p);
      System.out.print(Arrays.toString(list));
      System.out.print(Arrays.toString(list1));
   }
}
