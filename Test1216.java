public class Test1216 {
  public static void main(String[] args) {
    double x = Double.parseDouble("2.000");
    System.out.println("2.000".equals(String.valueOf(x)));
    try {
      method();
      System.out.println("After the method call");
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimException in main");
    }
    catch (Exception ex) {
      System.out.println("Exception in main");
    }
  }

  static void method() throws Exception {
    try {
      String s = "abc";
      System.out.println(s.charAt(3));
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in method()");
    }
    catch (Exception ex) {
      System.out.println("Exception in method()");
    }
    finally {
      System.out.println("Hey am here!");
    }
  }
}
