public class AnalyzeNumbers {
   public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      System.out.print("Enter the number of elements:");
      int n = input.nextInt();
      double[] T = new double[n];
      for (int i = 0; i < n; ++i) {
         System.out.print("T[" + i + "]=");
         T[i] = input.nextInt();
      }

      int sum = 0;
      for (int i = 0; i < n; ++i)
         sum += T[i];
      int avg = sum / n;

      for (int i = 0; i < n; ++i)
         if (T[i] > avg)
            System.out.println("T[" + i + "]=" + T[i]);
      for (double x : T)
         System.out.println(x);
   }
}
