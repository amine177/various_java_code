public class Circle extends GeometricObject
{
  private double radius;

  public Circle() {
    radius = 0;
  }

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled)
  {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }
}
