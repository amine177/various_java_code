public class CircleWithException {
  private double radius;

  private static int numberOfObjects = 0;

  CircleWithException() {
    radius = 1;
    numberOfObjects++;
  }

  CircleWithException(double r) throws InvalidRadiusException {
    setRadius(r);
    numberOfObjects++;
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius)
  throws InvalidRadiusException {
    if (radius >= 0)
      this.radius = radius;
    else
      throw new InvalidRadiusException(radius);
    }

  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-3);
      CircleWithException c3 = new CircleWithException(0);
    } catch (InvalidRadiusException ex) {
      System.out.println(ex);
      ex.printStackTrace();
    }
    System.out.println("Number of objects creaated: " +
                       CircleWithException.getNumberOfObjects());
  }
}
