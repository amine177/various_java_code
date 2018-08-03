public class PrimeNumber {
   public static void main(String[] args) {}

   public static boolean isPrime(int n) {
      for (int i = 2; i <= Math.pow(n, 0.5); ++i)
         if ( n % i == 0 )
            return false;
      return true;
   }
}
