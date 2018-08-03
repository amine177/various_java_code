import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Scanner;


public class GetScores {
  public static void main(String[] args) {
    try {
      URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
      Scanner input = new Scanner(url.openStream());
      while (input.hasNext()) {
        System.out.println(input.nextInt());
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
