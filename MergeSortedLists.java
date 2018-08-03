import java.util.Scanner;
import java.util.Arrays;
public class MergeSortedLists {
   public static void main(String[] main) {
      // Get first table length and allocate
      int[] list1 = new int[getTableLength()];
      int[] list2 = new int[getTableLength()];
      int[] merger = new int[list1.length + list2.length];
      int newLength = merger.length;
      int biggerLength = maxOfTow(list1.length, list2.length);
      int i, j, o;
      i = j = o = 0;

      // Get second table length and allocate
      // Allocate a third merger table
      // Find longest table
         // Compare tow elements of tow tables
         // Affect the smaller element in the merger table
         // Advance in the smaller element's table

      fillSorted(list1);
      fillSorted(list2);
      merger = mergeTables(list1, list2);
      System.out.println(Arrays.toString(list1));
      System.out.println(Arrays.toString(list2));
      System.out.println(Arrays.toString(merger));
   }

   public static int getTableLength() {
      Scanner input = new Scanner(System.in);
      int length;
      do {
      System.out.print("Enter table length: ");
      length = input.nextInt();
      } while (length < 1);
      return length;
   }

   public static int maxOfTow(int a, int b) {
      if (a > b)
         return a;
      return b;
   }

   public static int[] mergeTables(int[] list1, int[] list2) {
      /*int j, p, i;
      i = j = p = 0;
      int[] merger = new int[list1.length + list2.length];
      while (j < list1.length && p < list2.length)
         merger[i++] = 
            list1[j] < list2[p] ? list1[j++] : list2[p++];
      while (j < list1.length)
         merger[i++] = list1[j++];
      while (p < list2.length)
         merger[i++] = list2[p++];
         */
      int[] merger = new int[list1.length + list2.length];
      int i = list1.length - 1;
      int j = list2.length - 1;
      int k = merger.length;
      while (k > 0)
         merger[--k] = 
            (
             j < 0 || ( i >= 0 && list1[i] >= list2[j]) ? 
             list1[i--] : list2[j--]);
      return merger;
   }

   public static int minOfTow(int a, int b) {
      if (a > b)
         return b;
      return a;
   }


   public static void fillSorted(int[] list) {
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < list.length; ++i) {
         int x = input.nextInt();
         System.out.println("N " +i);
         if ( i != 0)
                if (list[i] <= x)
            list[i] = x;
                else
            i--;
         else
            list[i] = x;
      }
   }
}
