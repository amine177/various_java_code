public class TotalArea {
   public static void main(String[] args) {
      CircleWithPrivateFields[] circleArray;

      circleArray = createCircleArray(5);

      printCircleArray(circleArray);
   }

   public static CircleWithPrivateFiels[] createCircleArray(int n) {
      CircleWithPrivateFields[] c = new CircleWithPrivateFields[n];
      for (int i = 0; i < c.length; ++i)
         c[i] = new CircleWithPrivateFields(Math.random() * 100);
      return c;
   }

   public static void printCircleArray(CircleWithPrivateFields[] c) {
   }
}
