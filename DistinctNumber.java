import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumber {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    int value;
    System.out.print("Enter integers (input ends with 0): ");

    do {
      value = input.nextInt();
      if (!list.contains(value))
        list.add(value);
    } while (value != 0);

    for (int i = 0; i < list.size(); ++i)
      System.out.print(list.get(i) + " ");
  }
}
