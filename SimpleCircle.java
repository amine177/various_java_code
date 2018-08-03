class SimpleCircle {
   double radius = 1;
   static int numberOfObjects = 0;

   SimpleCircle() {
      numberofObjects++;
   }

   SimpleCircle(double newRadius) {
      radius = newRadius;
      numberofObjects++;
   }


   double getArea() {
      return radius * radius * Math.PI;
   }


   double getPerimemter() {
      return 2 * radius * Math.PI;
   }

   void setRadius(double newRadius) {
      radius = newRadius;
   }
   
   
   double getRadius() {
      return radius;
   }
}
