import java.util.*;

public class TestHashSet {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("Beijing");
    set.retainAll(new HashSet<String>());

    System.out.println(set);
    LinkedHashSet<String> set1 = new LinkedHashSet<>();
    TreeSet<String> set2 = new TreeSet<>(new Comparator {
    });

    for (String s : set) {
      System.out.print(s.toUpperCase() + " ");
    }
  }
}
