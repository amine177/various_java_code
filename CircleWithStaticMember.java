public class CircleWithStaticMember {
   private double radius;

   private static int numberOfObjects = 0;

   CircleWithStaticMember() {
      radius = 1;
      numberOfObjects++;
   }

   CircleWithStaticMember(double r) {
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
      CircleWithStaticMember c = new CircleWithStaticMember();
      System.out.println(c.radius);
   }
}
