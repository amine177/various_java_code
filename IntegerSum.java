import java.util.ArrayList;

public class IntegerSum {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(-2);
    System.out.println("The sum of elements are: " + sum(list));
  }

  public static int sum(ArrayList<Integer> list) {
    int s = 0;
    for (int n : list)
      s += n;
    return s;
  }
}
