public class TestException {
  public static void main(String[] args) {
    try {
      System.out.println(sum(new int[] {1, 2, 3}));
    }
    catch (Exception ex) {
      ex.printStackTrace();
      System.out.println(ex.getMessage());
      System.out.println(ex.toString());
      StackTraceElement[] stackTrace = ex.getStackTrace();
      for (int i = 0; i < stackTrace.length; i++) {
        System.out.print("method " +
            stackTrace[i].getMethodName());
        System.out.println("(" +
            stackTrace[i].getClassName() + ":" +
            stackTrace[i].getLineNumber() + ")");
      }
    }
  }

  public static int sum(int[] list) {
    int result = 0;
    for (int i = 0; i <= list.length; i++)
      result += list[i];
    return result;
  }
}
