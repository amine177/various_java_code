import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;


public class ReadFileFromURL {
  public static void main(String[] args) throws MalformedURLException {

    System.out.print("Enter a URL: ");
    String URLString = new Scanner(System.in).next();
    System.out.println(URLString);
    URL url;
    Scanner input;
      try {
        url = new URL(URLString);
        input = new Scanner(url.openStream());
        while (input.hasNext()) {
          System.out.println(input.nextLine());
        }
      } catch (MalformedURLException ex) {
        System.out.println("Invalid URL");
      } catch (java.io.IOException ex) {
        System.out.println("I/O: No such URL");
      }
    }
  }
