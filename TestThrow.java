public class TestThrow {
  public static void main(String[] args) {
    try {
      m();
    }
    catch (Exception o) {
      o.printStackTrace();
    }
  }

  public static void m() throws Exception {
    if ( 1 != 0)
      throw new Exception("Chaima karrzet");
  }
}
