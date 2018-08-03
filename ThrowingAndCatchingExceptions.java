import java.util.Scanner;

public class ThrowingAndCatchingExceptions {
  public static void main(String[] args) {
    try {
    testingManyThrows(0);
    }
    catch (ArithmeticException ex) {
      System.out.println(ex.getMessage());
      //ex.printStackTrace();
      System.out.println(ex.getStackTrace()[2]);
    }
    catch (Exception ex) {
      System.out.println("ouuh");
    }
  }

  public static void testingManyThrows(int x)
    throws Exception, ArithmeticException {
    if (x == 0)
      throw new ArithmeticException("Please enter" + 
          "non zero");
    throw new Exception("Chaima t8achet");
  }
}
