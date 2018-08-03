import java.util.Scanner;

public class RepeatAdditionQuiz {
   public static void main(String[] args) {
      int randNumber = (int) (Math.random() * 10);

      Scanner input = new Scanner(System.in);

      int number = input.nextInt();
      while ( number != randNumber) {
         number = input.nextInt();
      }
      System.out.println("Done!");
   }
}
