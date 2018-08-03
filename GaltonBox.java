import java.util.Arrays;
import java.util.Scanner;
public class GaltonBox {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of balls to drop: ");
      int nballs = input.nextInt();
      System.out.print(
         "Enter the number of slots in the bean machine: ");
      int nslots = input.nextInt();
      int[] slots = new int[nslots];
      Arrays.fill(slots, 0);

      for (int i = 0; i < nballs; ++i) {
         int position = 0;
         for (int j = 0; j < nslots - 1; j++) {
            if (Math.random() > 0.5) {
            System.out.print('R');
            position += 1;
            }
            else
               System.out.print('L');
         }
         slots[position] += 1;
         System.out.println();
      }
      boolean empty = false;
      while (!empty) {
         empty = true;
         int max = maxArray(slots);
         for (int i = 0; i < slots.length; ++i) {
            if (slots[i] != 0) {
                     empty = false;
                     if (slots[i] == max ) {
                        System.out.print('O');
                        slots[i]--;
                     }
                     else
                        System.out.print(' ');
            }
         }
         System.out.println(); 
      }
         }
   public static int maxArray(int[] list) {
      int max = list[0];
            for (int i = 0; i < list.length; ++i)
         if (list[i] > max) 
            max = list[i];
      return max;
         }
}
