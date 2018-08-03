import java.util.Scanner;

public class LinearSearchDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] list = {1, 3, 4, 5, 7};

      System.out.println("Write an element to search:");
      int element = input.nextInt();
      int i = LinearSearch.linearSearch(list, element);
      if ( i != -1)
         System.out.println(
               "Your result is: " + list[i]
               );
      else
         System.out.println("Not found!");
   }
}
