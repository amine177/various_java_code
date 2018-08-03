public class SavingsAccount
  extends Account97 {
  private double minimumBalance;

  public SavingsAccount() {
    this(0, 10, 10);
  }

  public SavingsAccount(int id, int balance, int min) {
    super(id, balance);
    minimumBalance = min;
  }

  @Override
  public void withdraw(double amount) {
    if (getBalance() - amount >= minimumBalance)
      super.withdraw(amount);
  }

  @Override
  public String toString() {
    return "Savings" +super.toString() +
      "minimum = "  + minimumBalance;
  }
}
