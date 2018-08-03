public class ConditionalTest {
  public static void main(String[] args) throws Exception {
    if (1 == 1)
      System.out.println("Hello");
    else
      throw new Exception("Hello Babe");
  }
}
