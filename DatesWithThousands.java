import java.util.Date;
public class DatesWithThousands {
   public static void main(String[] args) {
      long i = 10;
      Date[] date = new Date[8];
      int j = 0;
      while(i <= 100000000 && j < 8) {
         date[j] = new Date(i * 1000);
         j++;
         i *= 10;
      }
      for (int l = 0; l < date.length; l++)
         System.out.println(date[l].toString());
   }
}
