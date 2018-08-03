public class Square extends GeometricObject
  implements Colorable{
  private double side;

  public Square() {
    side = 1;
  }

  public Square(double side) {
    this.side = side;
  }

  public Square(String color, boolean filled,
      double side) {
    super(color, filled);
    this.side = side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  @Override
  public double getArea() {
    return side * side;
  }

  @Override
  public double getPerimeter() {
    return side + side + side + side;
  }

  @Override
  public String toString() {
    return "Square: " + side + super.toString();
  }

  @Override
  public void howToColor() {
    System.out.println("Color all four sides.");
  }
}
