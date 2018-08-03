public class Faculty
  extends Employee {
  private int hours;
  private String rank;
  public Faculty(String name, String phoneNumber,
      String emailAddress, String gender, String office,
      long salary, String rank, String title) {
    super(name, phoneNumber, emailAddress, gender, office,
        salary);
    this.rank = rank;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }
}
