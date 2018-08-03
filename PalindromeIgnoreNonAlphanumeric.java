import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a new string");
      String s = input.nextLine();
      System.out.println(isPalindrome(s));
   }

   public static boolean isPalindrome(String s) {
      System.out.println(s);
      String s1 = filter(s);

      String s2 = reverse(s1);
      return s2.equals(s1);
   }

   public static String filter(String s) {
      StringBuilder s1 = new StringBuilder();
      for (int i = 0; i < s.length(); ++i)
         if (!Character.isDigit(s.charAt(i))) {
            s1.append(s.charAt(i));
         }
      return s1.toString();
   }

   public static String reverse(String s) {
      return (new StringBuilder(s).reverse()).toString();
   }
}
