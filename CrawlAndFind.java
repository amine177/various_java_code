import java.util.ArrayList;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
public class WebCrawler {
  public static void main(String[] args) {
    System.out.print("Enter a URL: ");
    crawl((new Scanner(System.in)).nextLine());
  }

  public static void crawl(String start) {
    ArrayList<String> listPending = new ArrayList<>();
    ArrayList<String> listVisited = new ArrayList<>();
    listPending.add(start);
    while (!listPending.isEmpty() &&
           listVisited.size() < 100) {
      String currentURL = listPending.remove(0);
      if (!listVisited.contains(currentURL)) {
        listVisited.add(currentURL);
        System.out.println("Crawl: " + currentURL);
        for (String s : getSubURLs(currentURL)) {
          if (!listPending.contains(s))
            listPending.add(s);
        }
      }
    }
  }

  public static ArrayList<String> getSubURLs(String s) {
    ArrayList<String> list = new ArrayList<>();
    try {
      URL url = new URL(s);
      Scanner input = new Scanner(url.openStream());
      int startIndex = 0;
      while (input.hasNext()) {
        String line = input.nextLine();
        startIndex = line.indexOf("http:", startIndex);
        while (startIndex > 0) {
          int endIndex = line.indexOf("\"", startIndex);
          if (endIndex > 0) {
            list.add(line.substring(startIndex, endIndex));
            startIndex = line.indexOf("http:", endIndex);
          }
          else
            startIndex = -1;
        }
        if (line.indexOf("Computer Programming") >= 0)
          System.out.println("Found on :" + url);
      }
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
    return list;
  }
}
