public class ChainedExceptionDemo {
  public static void method1()
  throws Exception {
    try {
      method2();
    } catch (Exception ex) {
      throw new Exception("Throwing from" +
                          " method1", ex);
    }
  }

  public static void method2()
  throws Exception {
  try {
    method3();
  } catch (Exception ex) {
    throw new Exception("Throwing form" +
        "method2", ex);
  }
  }
  public static void method3()
  throws Exception {
    throw new Exception("This is method3");
  }

  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
