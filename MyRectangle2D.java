public class MyRectangle2D {
   double x,y;
   double height, width;

   public MyRectangle2D() {
      this(0, 0, 1, 1);
   }

   public MyRectangle2D(double x, double y, double height, double width) {
      this.x = x;
      this.y = y;
      this.height = height;
      this.width = width;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getWidth() {
      return this.width;
   }

   public double getHeight() {
      return this.height;
   }

   public boolean contains(double x, double y) {
      return Math.abs(x - this.x) <=  this.width &&
         Math.abs(y - this.y) <= this.height;
   }

   public boolean contains(MyRectangle2D rectangle) {
      return Math.abs(this.x - rectangle.getX()) <= this.width &&
      Math.abs(this.y - rectangle.getY()) <= this.height;
   }

   public boolean overlaps(MyRectangle2D rectangle) {
      return Math.abs(
         this.x - rectangle.getX()) < this.width + rectangle.width &&
         Math.abs(
            this.y - rectangle.getY()) < this.height +
         rectangle.getHeight();
   }

   private double distance(double x, double y, double x1, double y1) {
      return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
   }
}
