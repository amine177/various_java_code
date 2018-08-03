import java.util.Date;

public class Employee
  extends Person {
  private String office;
  private long salary;
  private Date dateHired;

  public Employee(String name, String phoneNumber,
      String emailAddress, String gender,
      String office, long salary) {
    super(name, phoneNumber, emailAddress, gender);
    this.office = office;
    dateHired = new Date();
  }

  public Date getDateHired() {
    return dateHired;
  }

  public void setDateHired(Date d) {
    dateHired = d;
  }
}
