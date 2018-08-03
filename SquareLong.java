public class SquareLong {
   public static void main(String[] args) {
      Double x = new Double(Long.MAX_VALUE);
      int i = 0;
      while (i < 50) {
         if (Math.sqrt(x.doubleValue()) == Math.sqrt(x.longValue())){
            i++;
         }
         x++;
         System.out.println(x);
      }
   }
}
