import java.util.GregorianCalendar;


public class Calendar95 {
   public static void main(String[] args) {
      GregorianCalendar cal = new GregorianCalendar();
      displayDate(cal);
      cal.setTimeInMillis(1234567898765L);
      displayDate(cal);
   }

   public static void displayDate(GregorianCalendar cal) {
      System.out.println("**********\nExec display Date:");
      System.out.println(
         "The current year is: " + 
         cal.get(GregorianCalendar.YEAR) +
         "\nThe current month is: " +
         cal.get(GregorianCalendar.MONTH) + 1 +
         "\nThe current day is: " +
         cal.get(GregorianCalendar.DAY_OF_MONTH));
   }

}
