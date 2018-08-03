import java.util.Date;
public class Account97 {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  Account97() {
    this(0, 0);
  }

  Account97(int id, int balance) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = 0;
    this.dateCreated = new Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return this.balance;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public Date getdatCreated() {
    return this.dateCreated;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
  public void setAnnualInterestRate(int rate) {
    this.annualInterestRate = rate;
  }

  public double getMonthlyInterestRate() {
    return ( this.balance / 100  *  this.annualInterestRate / 12);
  }

  public void withdraw(double amount) {
    this.balance = amount >= this.balance ? 
       0 : this.balance - amount;
  }

  public void deposit(int amount) {
    this.balance += amount;
  }

  @Override
  public String toString() {
    return "Account: " + id +
      "balance = " + balance;
  }
}
