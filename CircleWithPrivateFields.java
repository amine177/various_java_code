public class CircleWithPrivateFields {
   private double radius;

   private static int numberOfObjects = 0;

   CircleWithPrivateFields() {
      radius = 1;
      numberOfObjects++;
   }

   CircleWithPrivateFields(double r) {
      radius = r;
      numberOfObjects++;
   }

   public static int getNumberOfObjects() {
      return numberOfObjects;
   }

   double getArea() {
      return radius * radius * Math.PI;
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public static void main(String[] args) {
      CircleWithPrivateFields c = new CircleWithPrivateFields();
      System.out.println(c.radius);
   }
}
