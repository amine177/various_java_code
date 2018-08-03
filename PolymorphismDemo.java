public class PolymorphismDemo {
   public static void main(String[] args) {
      displayObject(new CircleFromSimpleGeometricObject
            (1));
      displayObject(new RectangleFromSimpleGeometricObject
            ());
   }

   public static void displayObject(SimpleGeometricObject object) {
   }
}
