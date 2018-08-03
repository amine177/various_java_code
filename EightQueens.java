import java.util.Arrays;
import java.util.Scanner;
public class EightQueens {
   public static void main(String[] args) {
      int[] position = {-1, -1, -1, -1, -1, -1, -1, -1}; 
      int[] positioninit = {-1, -1, -1, -1, -1, -1, -1, -1}; 
      Scanner input = new Scanner(System.in);
      while (true) {
         input.nextLine();
         Arrays.fill(position, -1);
         position[0] = (int) (Math.random() * 8);
         for (int i = 1; i < 8; ++i) {
            int newposition = (int) (Math.random() * 8);
            System.out.println(newposition + " **** " + i);
            if (indexOf(position, newposition) == -1) {
               if (i != 7) {
                  if (position[i - 1 ] != newposition && position[i - 1] != newposition - 1 && position[i - 1] != newposition +1)
                     position[i] = newposition;
                  else {
                     i--;
                     continue;
                  }
               }

               else {
                  if (position[6] != newposition && position[6] != newposition - 1 && position[6] != newposition + 1)
                     position[7] = newposition;
                  else 
                     i--;
               }

            }
            else 
               i--;
         }


         System.out.println(Arrays.toString(position));
         for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j)
               if (j != position[i])
                  System.out.print(" |");
               else 
                  System.out.print("X|");
            System.out.println();
         }
      }

   }



   public static int indexOf(int[] list, int element) {
      for (int i = 0; i < list.length; ++i)
         if (list[i] == element)
            return i;
      return -1;
   }
}



   // if positiions[newpositions - 1] != 1
   //
   // and if posiitons[newpositions + 1] != 1
   // 




















