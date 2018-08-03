import java.util.Random;

public class Random94 {
   public static void main(String[] args) {
      Random rand = new Random(1001);
      for (int i = 0; i < 50; i++) {
         System.out.println(rand.nextInt(100));
      }
   }
}
