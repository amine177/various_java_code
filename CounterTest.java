public class CounterTest {

  public static void main(String[] args) {

    Counter c1 = new Counter(10);
    Counter c2 = new Counter();

    System.out.println("c1's current value is: " + c1.getCount());
    System.out.println("c2's current value is: " + c2.getCount());

    c1.increment();
    System.out.println("c1's current value is: " + c1.getCount());
    c1.increment(10);
    System.out.println("c2's current value is: " + c2.getCount());

    System.exit(0);

  }
}
