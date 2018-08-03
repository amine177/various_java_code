public class VarArgsDemo {
   public static void main(String[] args) {
      printMax(23, 34, 3, 5);
      printMax(new double[]{1, 2, 3});
   }

   public static void printMax(double... numbers) {
      if (numbers.length == 0) {
         System.out.println("No arguments passed");
         return;
      }

      double max = numbers[0];
      for (int o = 1; o < numbers.length; ++o)
         if (numbers[o] > max)
            max = numbers[o];
      System.out.println("Your max is : " + max);
   }

}
