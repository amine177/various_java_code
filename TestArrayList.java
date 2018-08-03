import java.util.ArrayList;

public class TestArrayList {
   public static void main(String[] args) {
      ArrayList<String> cityList = new ArrayList<>();

      cityList.add("London");
      cityList.add("Denver");
      cityList.add("Paris");
      cityList.add("Miami");
      cityList.add("Seoul");
      cityList.add("Tokyo");
      System.out.println("List size? " + cityList.size());
      System.out.println("Is Miami in the lsit? " +
            cityList.contains("Miami"));
      System.out.println("The location of denver in the list? " +
            cityList.indexOf("Denver"));
      System.out.println("Is empty? " + 
            cityList.isEmpty());
      cityList.remove("Miami");
      cityList.remove(1);
   }
}
