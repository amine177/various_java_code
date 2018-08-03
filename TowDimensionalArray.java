import java.util.Scanner;
import java.util.Arrays;
public class TowDimensionalArray {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[][] matrix = new int[5][5];
      for (int i = 0; i < matrix.length; ++i) {
         for (int j = 0; j < matrix[i].length; ++j) {
            matrix[i][j] = (int) (Math.random() * 99);
         }
      }

      for (int i = 0; i < matrix.length; ++i) {
         int sum = 0;
         for (int j = 0; j < matrix[i].length; j++)
            sum += matrix[i][j];
         System.out.println(Arrays.toString(matrix[i]));
         System.out.println("Sum of row " + i + " is " + sum);

      }
   }
}
