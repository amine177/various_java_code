import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
  public static void main(String[] args) {
    String[] array = {"red", "green", "blue"};
    ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
    java.util.Collections.sort(list);
    System.out.println(list);
    System.out.println(java.util.Collections.max(list));
    Integer[] a = {3, 5, 3, 2, 3};
    System.out.println(java.util.Collections.max(Arrays.asList(a)));
    java.util.Collections.shuffle(list);
    System.out.println(list);
  }
}
