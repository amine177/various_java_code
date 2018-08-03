public class IsNumeric {
  public static void main(String[] args) {
    System.out.println(isNumeric("-12."));
  }

  public static boolean isNumeric(String token) {
    return token.matches("[+-]?\\d+\\.\\d*");
  }
}
