import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Object s = new Student("ali", "d", "dl", "dkjf", "dkfk");
    System.out.println(s);
    /*
    Scanner input = new Scanner(System.in);
    System.out.println("Enter many integers and end with 0");
    int val;
    do {
      val = input.nextInt();
      list.add(new Integer(val));
    } while (val != 0);
    System.out.println(max(list));
    */
  }

  public static Integer max(ArrayList<Integer> list) {
    Integer m = list.get(0);
    for (Integer i : list)
      m = i > m ? i : m;
    return m;
  }
}
