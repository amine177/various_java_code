public class Test126a {
  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      try {
        System.out.println(1 / 0);
      }
      catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
