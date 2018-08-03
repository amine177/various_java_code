import java.util.Random;

public class RandomTest {
   public static void main(String[] args) {
      Random rand1 = new Random(3);

      for (int i = 0; i < 10; i++)
         System.out.print(rand1.nextInt() + " ");
   }
}
