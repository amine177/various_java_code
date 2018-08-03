public class ComparableCircle
  extends Circle
  implements Comparable<GeometricObject> {


  public ComparableCircle() {
    super(1);
  }

  public ComparableCircle(double radius) {
    super(radius);
  }

  @Override
  public int compareTo(GeometricObject c) {
    if (this.getArea() > c.getArea())
      return 1;
    else if (this.getArea() < c.getArea())
      return -1;
    else
      return 0;
  }
}
