public class IsEven {
  public static void main(String[] args) {
    System.out.println(isEven(3));
    System.out.println(isEven(6));
    System.out.println(isEven(2));
    System.out.println(isEven(5));
  }

  public static boolean isEven(int n) {
    int c = 0;
    while (n - 2 >= 0) {
      n -= 2;
      c++;
    }
    if (n == 0)
      return true;
    else
      return false;
  }
}
