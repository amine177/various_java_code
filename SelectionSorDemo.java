import java.util.Scanner;

public class SelectionSortDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] list = new int[10];
      System.out.println("Enter 10 digits!");
      for (int i = 0; i < 10; ++i) {
         System.out.println("list[" + i + "]=");
         list[i] = input.nextInt();
      }

      SelectionSort.selectionSort(list);
      for (int x : list)
         System.out.println(x + ", ");
   }
}
