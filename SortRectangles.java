public class SortRectangles {
  public static void main(String[] args) {
    ComparableRectangle[] rectArray = {
      new ComparableRectangle(3, 3),
      new ComparableRectangle(23, 2),
      new ComparableRectangle(24, 2),
      new ComparableRectangle(2, 4)
    };
    java.util.Arrays.sort(rectArray);
    for (Rectangle rectangle : rectArray)
      System.out.println(rectangle);
  }
}
