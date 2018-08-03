import java.util.Date;
public class Loan {
   private double annualInterestRate, loanAmount;
   private int numberOfYears;
   private Date loanDate;

   public Loan() {
      this(2.5, 1, 100);
   }

   public Loan(double annualInterestRate, 
         int numberOfYears, double loanAmount) {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
   }

   public double getAnnualInterestRate() {
      return annualInterestRate;
   }

   public int getNumberOfYears() {
      return numberOfYears;
   }

   public double getLoanAmount() {
      return loanAmount ;
   }

   public void setAnnualInterstRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
   }

   public void setNumberOfYear(int numberOfYears) {
      this.numberOfYears = numberOfYears;
   }

   public void setLoanAmout(double loanAmout) throws IllegalArgumentException {
     if (loanAmount <= 0)
       throw new IllegalArgumentException("Loan > 0");
      this.loanAmount = loanAmount;
   }

   public double getMonthlyPayment() {
      double monthlyInterestRate = this.annualInterestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
            (1/ Math.pow(1 + monthlyInterestRate, 
               numberOfYears * 12)));

      return monthlyPayment;
   }

   public double getTotalPayment() {
      double totalPayment = getMonthlyPayment() * numberOfYears * 12;
      return totalPayment;
   }
}
