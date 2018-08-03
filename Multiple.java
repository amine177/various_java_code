public class Multiple {
  public static void main(String[] args) {
    System.out.println(isMultiple(2005, 100));
  }

  public static boolean isMultiple(long n, long m) {
    if (n == m || n % m == 0)
      return true;
    else
      return false;
  }
}
