import java.util.ArrayList;


public class TestCloningArrayList {
  public static void main(String[] args) {
    ArrayList<Double> list1 = new ArrayList<>();
    list1.add(4.);
    list1.add(5.);
    list1.add(10.);
    ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
    ArrayList<Double> list3 = list1;
    System.out.println("list1 is " + list1);
    System.out.println("list2 is " + list2);
    System.out.println("list3 is " + list3);
  }
}
