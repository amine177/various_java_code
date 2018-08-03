import java.util.Scanner;

public class CurrentTimeGMT {
   public static void main(String[] args) {

      long totalTimeMilliSeconds = System.currentTimeMillis();

      long totalSeconds = totalTimeMilliSeconds / 1000;
      long currentSecond = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60;
      long currentMinute = totalMinutes % 60;
      long totalHours = totalMinutes / 60;
      long currentHour = totalHours % 24;

      System.out.println
         ("Time is : " + currentHour + "H: " + currentMinute + "M: " + currentSecond + "S");
   }
   
}
