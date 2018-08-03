public class TestComparable implements Comparable {
  public void x() {
    System.out.println(this instanceof Comparable);
  }

  @Override
  public int compareTo(Object o) {
    return 1;
  }
}
