public class Triangle2D {
   private MyPoint p1, p2, p3;

   public MyPoint getPoint(int number) {
      if (number == 1)
         return this.p1;
      else if ( number == 2)
         return this.p2;
      else
         return this.p3;
   }

   public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
   }

   public Triangle2D() {
      this(new MyPoint(0, 0), new MyPoint(2, 5), new MyPoint(2, 5));
   }
}
