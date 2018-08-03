public class RationalTest {
  public static void main(String[] args) throws Exception {
    Rational r1 = new Rational(1, 123456789);
    Rational r2 = new Rational(1, 123456789);
    Rational r3 = new Rational(1, 122456789);
    System.out.println(r1.compareTo(r3));
    System.out.println(r1.divide(r1));
  }
}
