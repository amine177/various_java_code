public class TestGeometricObject {

  public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
    return o1.getArea() == o2.getArea();
  }

  public void displaGeometricObject(GeometricObject o) {
    System.out.println();
    System.out.println("The area is: " + o.getArea());
    System.out.println("The perimeter is: " + o.getPerimeter());
  }
  public static void main(String[] args) {
    Circle c = new Circle(4.2);
    Rectangle r = new Rectangle(3, 3);
    System.out.println("Are both objects equal?: " +
        equalArea(c, r));
    System.out.println("Circle: " + 
        "\n\tPerimiter: " + c.getPerimeter());
    System.out.println("Rectangle: " + r.getPerimeter());
  }
}
