public class F {
   private int x = 0;
   private int y = 0;

   public F() {
   }

   public void p(int i) {
      int x = i;
      System.out.println("x= " + x);
      System.out.println("x= " + this.x);
      System.out.println("y= " + y);
   }
}
