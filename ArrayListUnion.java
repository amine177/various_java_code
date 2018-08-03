import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUnion {
  public static void main(String[] args) {
    Integer[] a = {1, 2};
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(a));
    Integer[] b = {1, 3};
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(b));
    System.out.println(union(list1, list2));
  }

  public static ArrayList<Integer> union(
      ArrayList<Integer> list1, ArrayList<Integer> list2) {
    ArrayList<Integer> retlist = new ArrayList<Integer>();
    retlist.addAll(list1);
    retlist.addAll(list2);
    return retlist;
  }
}
