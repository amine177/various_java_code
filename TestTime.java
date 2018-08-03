public class TestTime {
   public static void main(String[] args) {
      Time t = new Time();
      System.out.println(t);
      Time t1 = new Time(1000);
      System.out.println(t1);
      t1.setTime(5000);
      System.out.println(t1);
   }
}
