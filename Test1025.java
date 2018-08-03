public class Test1025 {
   public static void main(String[] args) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Hello");
          stringBuilder.deleteCharAt(4);
          System.out.println(stringBuilder);
          String s = "ABCD";
          System.out.println(s.substring(2, 3) + s.length());
          System.out.println(s[0]);
   }
}
