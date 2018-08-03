public class Test125 {
  public static void main(String[] args) {
    try {
      int value = 30;
      if (value < 40)
        throw new Exception("Value is too small");
    }
    catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Continue after the catch block");
  }
}
