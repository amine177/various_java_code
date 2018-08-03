import java.util.ArrayList;

public class ShuffleArrayList {
  public static void shuffle(ArrayList<Number> list) {
    for (int i = 0; i < list.size(); i++) {
      int randpos = (int)(Math.random() * list.size() - 1);
      if (randpos != i) {
        Number tmp = list.get(i);
        list.set(i, list.get(randpos));
        list.set(randpos, tmp);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(3);
    System.out.println(list);
    shuffle(list);
    System.out.println(list);
  }
}
