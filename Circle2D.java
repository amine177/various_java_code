public class Circle2D {
   private double x, y, radius;

   Circle2D() {
      this(0, 0, 1);
   }
   Circle2D(double x, double y, double radius) {
      this.x = x;
      this.y = y;
      this.radius = radius;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getRadius() {
      return this.radius;
   }

   public double getPerimiter() {
      return 2 * this.radius *  Math.PI;
   }

   public double getArea() {
      return Math.PI * Math.pow(this.radius, 2);
   }

   public boolean contains(double x, double y) {
      return Circle2D.distance(x, y, this.x, this.y) <= this.radius;
   }

   public boolean overlaps(Circle2D circle) {
      return contains(circle.getX(), circle.getY()) &&
         this.getRadius() >= Circle2D.distance(
            circle.getX(), circle.getY(),
                this.x, this.y) + circle.getRadius();
   }

   public static double distance(double x, double y, double x1, double y1) {
      return Math.pow(Math.pow( x - x1, 2) + Math.pow( y - y1, 2), 0.5);
   }
}
