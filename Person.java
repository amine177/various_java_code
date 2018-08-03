public class Person {
  private String name;
  private String phoneNumber;
  private String emailAddress;
  private String gender;

  public Person() {
  }

  public Person(String name, String phoneNumber,
      String emailAddress, String gender) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person: name = " + name +
      " gender = " + gender + " phone: " +
      " email: " + emailAddress;
  }

}
