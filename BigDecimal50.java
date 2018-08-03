import java.math.BigDecimal;

public class BigDecimal50 {
   public static void main(String[] args)  {
      BigDecimal d = new BigDecimal(1);
      for (int i = 0; i < 50; i++)
         d = d.multiply(new BigDecimal(10));
      int i = 0;
      while (i < 10) {
         if (d.remainder(new BigDecimal(2)).intValue() == 0) {
            System.out.println(d);
            i++;
         }
         d = d.add(new BigDecimal(1));
      }
   }
}
