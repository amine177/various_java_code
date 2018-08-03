import java.util.Scanner;

public class RandomCharacter {

   public static char getRandomChar(char ch1, char ch2) {
      return (char)(ch1 + (Math.random() * (ch2 - ch1 + 1)));
   }

   public static char getRandomChar() {
      return getRandomChar('a', 'z');
   }
   public static void main(String[] args) {
      System.out.println(getRandomChar('a', 'b'));
      System.out.println(getRandomChar());
   }
}
