public class Rectangle extends GeometricObject {
   private double width;
   private double height;

   Rectangle() {
      this(1.0, 1.0);
   }

   Rectangle(double height, double width) {
      this.width = width;
      this.height = height;
   }

  @Override
   public double getArea() {
      return (this.width * this.height);
   }

  @Override
   public double getPerimeter() {
      return (this.width * 2) + (this.height * 2);
   }

   public double getWidth() {
      return this.width;
   }

   public double getHeight() {
      return this.height;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   @Override
   public String toString() {
     return "Width: " + width +
       " Height: " + height +
       " Area: " + getArea();
   }

   @Override
   public boolean equals(Object r) {
     return this.compareTo((Rectangle)r) == 0;
   }
}
