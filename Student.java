class Student
  extends Person {
  private String status;

  public Student(String name, String phoneNumber,
      String emailAddress, String gender,
      String status) {
    super(name, phoneNumber, emailAddress, gender);
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Student: name = " + getName() +
      " gender = " + getGender() +
      " status = " + status;
  }
}
