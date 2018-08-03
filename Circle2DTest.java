public class Circle2DTest {
   public static void main(String[] args) {
      Circle2D c1 = new Circle2D(2, 2, 5.5);
      System.out.println(c1.contains(8, 3));
      System.out.println(c1.overlaps(new Circle2D(2, 2, 5.6)));
   }
}
