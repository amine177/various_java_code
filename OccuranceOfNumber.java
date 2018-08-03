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
      int occ = 0;
      int p = 0;
      int[] occList = new int[n];
      for (int j = 0; j < list.length && p < n; j++) {
         if (list[j] != 101) {
                  for (int i = 0; i < n;
                        occ +=(list[i++] == list[j] ? (list[i] = 101) % 100 :0));
            occList[p++] = occ;
            occ = 0;
            System.out.println(Arrays.toString(list));
         }
      }
      System.out.print(Arrays.toString(occList));
   }

   public static int occuranceOfnumber(int[] list, int number, int d) {
      int occ = 0;
      for (int i = 0; i < list.length; ++i)
         if (list[i] == number) {
            occ++;
            list[i] = d;
         }
      return occ;
   }
}
