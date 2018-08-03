import java.util.Scanner;

public class BinarySearchDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] list = {1, 2, 3, 4, 7, 23};
      System.out.println("Enter the element to search:");
      int element = input.nextInt();
      int result = 
         BinarySearch.binarySearch(list, element);
      if ( result > -1)
         System.out.println("We have found it on: " + result );
      else
         System.out.println("Not found Babe !");
   }
}
