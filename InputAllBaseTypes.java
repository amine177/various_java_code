import java.util.Scanner;


public class InputAllBaseTypes {
  public static void main(String[] args) {
    inputAllBaseTypes();
  }

  public static void inputAllBaseTypes() {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int a = input.nextInt();
    System.out.println("Enter a float:");
    float f = input.nextFloat();
    System.out.println("Enter a double:");
    double d = input.nextDouble();
    System.out.println("Enter a boolean");
    boolean b = input.nextBoolean();
    System.out.println("Enter a byte:");
    byte by = input.nextByte();
    System.out.println("Enter a short:");
    short so = input.nextShort();

    System.out.println(a);
    System.out.println(f);
    System.out.println(d);
    System.out.println(b);
    System.out.println(by);
    System.out.println(so);

    System.exit(0);
  }
}

