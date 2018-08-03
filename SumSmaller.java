public class SumSmaller {
  public static void main(String[] args) {
    System.out.println(sumSmaller(4));
    System.out.println(sumSmallerOdd(4));
  }

  public static long sumSmaller(int n) {
    int result = 0;
    for (int i = 1; i < n; i++) {
      result += i;
    }
    return result;
  }

  public static long sumSmallerOdd(int n) {
    int result = 0;
    for (int i = 1; i < n; i++) {
      if (!IsEven.isEven(i))
        result += i;
    }
    return result;
  }
}
