import java.util.Scanner;
import java.util.Arrays;
public class GradExam {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students:");
      int numberOfStudents = input.nextInt();
      System.out.print("Enter the number of questions per student");
      int numberOfQuestions = input.nextInt();
      char[][] answers = new char[numberOfStudents][numberOfQuestions];
      for (int i = 0; i < numberOfStudents; ++i)
         for (int j = 0; j < numberOfQuestions; j++)
            answers[i][j] = randChar();
      char[] correctAnswers = new char[numberOfQuestions];
      for (int i = 0; i < numberOfQuestions; ++i)
         correctAnswers[i] = randChar();
      for (int i = 0; i < numberOfStudents; i++) {
         int score = 0;
         for (int j = 0; j < numberOfQuestions; j++)
            if (answers[i][j] == correctAnswers[j])
               score++;
         System.out.println("Student number " + i +
               " got " + score);
      }


   }
   public static char randChar() {
      char randomC = (char) ( 'A' + Math.random() * ('F' - 'A'));
      return randomC;
   }
}
