import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int x = (int) (Math.random() * 100);
    int y = (int) (Math.random() * 100);
    Scanner input = new Scanner(System.in);
    int val;
    do {
      System.out.print("What is " + x + " + " + y + " ? ");
      val = input.nextInt();
      if (list.indexOf(new Integer(val)) != -1)
          System.out.println("You already entered " + val);
      else list.add(new Integer(val));
    } while(val != x + y);
    System.out.println("WoW you did it!");
  }
}
