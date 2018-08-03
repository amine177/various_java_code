public class TestCircleWithCustomException {
  public static void main(String[] args) {
    try {
      new CircleWithCustomException(2);
      new CircleWithCustomException(-2);
      new CircleWithCustomException(3);
    }
    catch (InvalidRadiusException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created " +
        CircleWithCustomException.getNumberOfObjects());
  }
}


class CircleWithCustomException {
  private double radius;

  static private int numberOfObjects = 0;

  public CircleWithCustomException(double radius) throws
    InvalidRadiusException {
      setRadius(radius);
      numberOfObjects++;
    }

  public void setRadius(double radius) throws
    InvalidRadiusException {
    if (radius >= 0)
      this.radius = radius;
    else
      throw new InvalidRadiusException(radius);
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

}
