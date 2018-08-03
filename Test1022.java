public class Test1022 {
   private String text;
   public Test1022(String s) {
   String text  = s;
      }

   public static void main(String[] args) {
      System.out.println("Hi".matches(".i"));
      System.out.println("A,B;C".replaceAll("[,;]", "#"));
      }
}
