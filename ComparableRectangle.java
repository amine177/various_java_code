public class ComparableRectangle extends Rectangle
  implements Comparable<ComparableRectangle> {

  public ComparableRectangle(double a, double b) {
    super(a, b);
  }

  @Override
  public int compareTo(ComparableRectangle o) {
    if (getArea() > o.getArea())
      return 1;
    else if (getArea() < o.getArea())
      return -1;
    else
      return 0;
  }
}
