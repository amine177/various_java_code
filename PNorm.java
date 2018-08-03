public class PNorm {
  public static void main(String[] args) {
  }

  public static double pnorm(int[] v, int p) {
    double result = 0;
    for (int i : v)
      result += Math.pow(i, p);
    return Math.pow(result, (double)1/p);
  }

  public static double norm(int[] v) {
    return pnorm(v, 2);
  }
}
