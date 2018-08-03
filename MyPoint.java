public class MyPoint {
   private int x;
   private int y;

   public MyPoint() {
      this(0, 0);
   }

   public MyPoint(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public double distance(MyPoint point) {
      return Math.pow(Math.pow((this.x - point.x), 2) +
         Math.pow((this.y - point.y), 2), 0.5);
   }

   public double distance(int x, int y) {
      return Math.pow(Math.pow((this.x - x), 2) +
         Math.pow((this.y - y), 2), 0.5);
   }
}
