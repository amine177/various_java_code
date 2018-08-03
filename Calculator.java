import java.util.InputMismatchException;

public class Calculator {
   public static void main(String[] args) {
      System.out.println(java.util.Arrays.toString(args));
      System.out.println(args);

      if (args.length != 3) {
         String usage =
            " Usage: operand1 operator operadn2";
         System.out.println(usage);
         System.exit(0);
      }
      try {
        int result = 0;
        switch (args[1].charAt(0)) {
           case '+': result = Integer.parseInt(args[0]) +
                         Integer.parseInt(args[2]);
                break;
           case '-': result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
           case '/': result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
           case '.': result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
        }
        System.out.println(
              args[0] + ' ' + args[1] + 
              ' ' + args[2] + " = " + result);
     }
     catch (NumberFormatException ex) {
       System.out.println("Invalid input!");
     }
   }
}
