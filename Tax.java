public class Tax {
   final public static int SINGLE_FILER = 0;
   final public static int MARRIED_JOINLTLY_OR_QUALIFYING_WIDOW = 1;
   final public static int MARRIED_SEPARATELY = 2;
   final public static int HEAD_OF_HOUSEHOLD = 3;
   private int filingStatus;
   private int[][] brackets;
   private double[] rates;
   private double taxableIncome;
}
