import java.util.Scanner;


public class RandomArrayException {
  public static void main(String[] args) {
    int[] x = new int[100];
    for (int i = 0; i < 100; i++)
      x[i] = (int)(Math.random() * 100);
    System.out.println("Enter an index you want to access");
    int index = (new Scanner(System.in)).nextInt();
    try {
      System.out.println(x[index]);
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println(index + " is out of bound [0, 99]");
    }
  }
}
