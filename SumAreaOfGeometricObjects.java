public class SumAreaOfGeometricObjects {
  public static void main(String[] args) {
    GeometricObject[] a = {
    new Rectangle(2, 2), new Circle(3), new Square(4)};
    double sum = 0;
    for (GeometricObject o : a) {
      sum += o.getArea();
    }
    System.out.println("Sum is : " + sum);
  }
}
