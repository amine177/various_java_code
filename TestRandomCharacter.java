public class TestRandomCharacter {
   public static void main(String[] args) {
      for (int i = 0; i < 175; i++) {
         char ch = RandomCharacter.getRandomChar();
         if ((i + 1) % 15 == 0)
            System.out.println(ch);
         else
            System.out.print(ch);
      }
   }
}
