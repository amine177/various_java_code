import java.util.Scanner;


public class Palindrome {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string:");
      boolean isPalindrome = true;
      String s = input.nextLine();
      /*
      for (int i = 0; i < s.length() / 2 + 1; ++i) {
         if (s.charAt(i) != s.charAt(s.length() - i - 1))
            isPlaindrome = false
      }
      */
      int middle = s.length() / 2 + 1;
      int i = 0;
      int high = s.length() - 1;
      while (i < middle)
      {
         if (s.charAt(i) != s.charAt(high - i )) {
            isPalindrome = false;
            break;
         }
         ++i;
      }

      if (isPalindrome)
         System.out.println("Palindrome!");
      else
         System.out.println("Not palindrome!");
   }
}
