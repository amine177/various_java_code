public class C {
   private int p;

   public C() {
      this(0);
      System.out.println("C's no-arg constructor invokded");
   }

   public C(int p) {
      this.p = p;
   }
}
