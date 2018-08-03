class ExceptionTest implements Comparable {
  public static void main(String[] args) throws MoatezException {
    TestComparable c = new TestComparable();
    c.x();
    throw new MoatezException();
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
