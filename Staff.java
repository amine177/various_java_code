public class Staff
  extends Employee {
  private String title;

  public Staff(String name, String phoneNumber,
      String emailAddress, String gender, String office,
      long salary, String title) {
    super(name, phoneNumber, emailAddress, gender, office,
        salary);
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
