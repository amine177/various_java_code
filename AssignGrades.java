import java.util.Scanner;

public class AssignGrades {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the students' number: ");
      Integer n = input.nextInt();
      int[] scores = new int[n];
      for (int i = 0; i < n; i++) {
         System.out.print("T[" + i + "]= ");
         scores[i] = input.nextInt();
      }
      for (int i = 0; i < n; i++) {
         char grade = scores[i] >= 19 ?  'A' : 
            (scores[i] >= 18 ? 'B' :
            (scores[i] >= 15 ? 'C' :
            (scores[i] >= 10 ? 'D' : 'F'
            )));
         System.out.println( 
               "Student " + i + " score is " +
               scores[i] + " and grade is " + grade);
      }
   }
}
