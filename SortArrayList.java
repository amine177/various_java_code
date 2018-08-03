import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double value;
    ArrayList<Double> list = new ArrayList<>();
    System.out.print("Enter numbers and end with 0: ");
    do {
      value = input.nextDouble();
      list.add(value);
    } while(value != 0);
    System.out.println(list);
    sort(list);
    System.out.println(list);
  }

  public static void sort(ArrayList<Double> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) > list.get(j)) {
          Double tmp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, tmp);
        }
      }
    }
  }
}
