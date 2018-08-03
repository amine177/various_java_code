public class TestRectangle {
   public static void main(String[] args) {
      Rectangle r = new Rectangle(4, 40);
      System.out.printf(
         "Rectangle:\n%10s%.2f, %.2f", "", r.getWidth(), r.getHeight());
      System.out.printf(
         "\n%10sArea: %.2f","",r.getArea());
      System.out.printf(
            "\n%10sPerimeter: %.2f", "", r.getPerimeter());
   }
}
