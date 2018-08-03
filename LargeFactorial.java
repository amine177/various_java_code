import java.math.BigInteger;

public class LargeFactorial {
   public static void main(String[] args) {
      System.out.println(factorial(50));
   }

   public static BigInteger factorial(long n) {
      BigInteger result = BigInteger.ONE;
      for (long i = 1; i <= n; ++i)
         result = result.multiply(new BigInteger(i + ""));
      return result;
   }
}
