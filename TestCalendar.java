import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TestCalendar {
  public static void main(String[] args) {
    Calendar c = new GregorianCalendar();

    System.out.println("Current: ");
    System.out.println("Time: " + new Date());
    System.out.println("Year: " + c.get(Calendar.YEAR));
    System.out.println("Month: " + c.get(Calendar.MONTH));
    System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));

    Calendar calendar1 = new GregorianCalendar(2001, 8, 11);
    String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                              "Thursday", "Friday", "Saturday"};
    System.out.println("11/08/2001 is : " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)]);
  }
}
