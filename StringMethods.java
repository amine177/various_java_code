public class StringMethods {
   public static void main(String[] args) {

     String title = "Data Structures & Algorithms in Java";
     String term = "over" + "load";

     System.out.println(".length\n" + title.length());
     System.out.println(".charAt(2)\n" + title.charAt(3));

     //StringBuilder for more flexibility, especially mutability

     StringBuilder h = new StringBuilder(title);
     h.setCharAt(2, 'b');
     System.out.println(".charAt(2)/StringBuilder\n" + h.charAt(2));
     DAY t;
     t = DAY.TUE;


   }
}


enum DAY { MON, TUE, WED, THU, FRI, SAT, SUN };
