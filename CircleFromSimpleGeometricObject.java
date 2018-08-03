public class CircleFromSimpleGeometricObject
  extends SimpleGeometricObject {

  private double radius;

  public CircleFromSimpleGeometricObject() {
  }

  public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius, String color,
      boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    return Math.PI*radius*radius;
  }

  public double getPerimeter() {
    return Math.PI*radius;
  }
  
  public double getDiameter() {
    return 2*radius;
  }

  public static void printCircle(Circle c) {
    System.out.println("Circle: R(" + c.radius + ")");
  }
}
