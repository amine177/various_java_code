import java.util.Calendar;
import java.util.GregorianCalendar;


public class PrintCalendr {
  public static void printCalendar(int month, int year) {
    Calendar c = new GregorianCalendar(year, month, 1);
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
    "Aug", "Sep", "Oct", "Nov", "Dec"};
    int maxday = c.getMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    System.out.println("        " + months[month - 1]+ ", " + year);
    System.out.println("-----------------------------");
    for (int i = 0; i < 7; i++)
      System.out.printf("%-4s", dayNames[i]);
    System.out.println();
    for (int i = 1; i <= maxday; i++) {
      if (i >= c.get(Calendar.DAY_OF_WEEK)) {
        System.out.printf("%3d ", i - c.get(Calendar.DAY_OF_WEEK) + 1);
      }
      else
        System.out.printf("    ");
      if (i % 7 == 0)
        System.out.println();
    }
  }
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage: java PrintCalendr month year");
      System.exit(1);
    }
    printCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
  }
}
