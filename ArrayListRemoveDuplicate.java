import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemoveDuplicate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int value;
    ArrayList<Integer> list = new ArrayList<Integer>();
    do {
      value = input.nextInt();
      list.add(value);
    } while(value != 0);
    System.out.println(list);
    removeDuplicate(list);
    System.out.println(list);
  }

  public static void removeDuplicate(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for(int j = i + 1; j < list.size(); j++) {
        if (list.get(i) == list.get(j)) {
          list.remove(j);
          j--;
        }
      }
    }
  }
}
