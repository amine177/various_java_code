import java.util.Scanner;

public class HeartRate {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter you age in years: ");
    double age = input.nextDouble();
    System.out.print("Enter your heart rate: ");
    double rate = input.nextDouble();
    double fb = (rate - age) * 0.65;
    System.out.println("Your ideal fat-burning heart rate is " + fb);
    System.exit(0);
  }
}
