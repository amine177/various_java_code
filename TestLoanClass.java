public class TestLoanClass {
   public static void main(String[] args) {
      Loan newLoan = new Loan(5, 10, 10000);
      System.out.printf(
         "Your loan monthly is: %.2f",
         newLoan.getMonthlyPayment());
      System.out.printf("\nYou total payment is: %.2f", 
            newLoan.getTotalPayment());
   }
}
