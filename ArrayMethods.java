import java.util.*;
public class ArrayMethods {
   public static void main(String... args) {
      System.out.println(Arrays.toString(args));
      int[] list = {1, 32, 34, 23, 23, 232, -1, 4};
      System.out.println(Arrays.toString(list));
      shuffle(list);
      System.out.println(Arrays.toString(list));
      Arrays.sort(list);
      System.out.println(Arrays.toString(list));
      shuffle(list);
      System.out.println(Arrays.toString(list));
      char[] chars = {'a', 'z', 'c', 'x'};
      System.out.println("It is on index : " +
            java.util.Arrays.binarySearch(chars, 'c'));
      java.util.Arrays.fill(list, 2, 5, 8);
      System.out.println(Arrays.toString(list));
   }

   public static void shuffle(int[] list) {
      for (int i = 0; i < list.length; ++i) {
         int randIndex = ((int) Math.random() * list.length);
         int tmp = list[randIndex];
         list[randIndex] = list[i];
      }
   }

   public static void printArray(int[] list) {
      System.out.print("[");
      int n = list.length;
      for (int i = 0; i < n; ++i) {
         if (i != n - 1)
            System.out.print(list[i] + ", ");
         else
            System.out.print(list[i]);
      }
      System.out.println("]");
   }
}
