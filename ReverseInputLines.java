import java.util.Scanner;

public class ReverseInputLines {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] a = new String[100];
    int i = 0;
    System.out.println("*** Enter lines whowever you want ***");
    while (input.hasNextLine()) {
      a[i] = input.nextLine();
      if (a[i].equals("."))
        break;
      i++;
    }
    System.out.println("*** Printing reversed ***");
    for (; i >= 0; i--)
      System.out.println(a[i]);

    System.exit(0);
  }
}
