public class StopWatchTest {
   public static void main(String[] args) {
      StopWatch s = new StopWatch();
      System.out.println("Hi");
      for (int i = 0; i < 100; ++i)
         System.out.println(i);
      for (int i = 0; i < 100; ++i)
         System.out.println(i);
      s.stop();
      System.out.println(s.getElapsedTime());
   }
}
