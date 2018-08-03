public class Rational extends Number implements Comparable<Rational> {
  private long numerator;
  private long denominator;

  public Rational() throws DenominatorZeroException {
    this(0, 1);
  }

  public Rational(long numerator) throws DenominatorZeroException {
    this(numerator, 1);
  }

  public Rational(long numerator, long denominator) throws DenominatorZeroException {
    if (denominator == 0)
      throw new DenominatorZeroException("The denominator can't be zero!");
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public long getNumerator() {
    return numerator;
  }

  public void setNumerator(long numerator) {
    this.numerator = numerator;
  }

  public long getDenominator() {
    return denominator;
  }

  public void setDenominator(long denominator) throws DenominatorZeroException {
    if (denominator == 0)
      throw new DenominatorZeroException("The denominator can't be zero!");
    this.denominator = denominator;
  }

  public Rational add(Rational secondRational) throws DenominatorZeroException {
    return new Rational(
        this.getNumerator() * secondRational.getDenominator() +
        secondRational.getNumerator() * this.getDenominator(),
        this.getDenominator() * secondRational.getDenominator());
  }

  public Rational subtract(Rational secondRational) throws DenominatorZeroException {
    return new Rational(
        this.getNumerator() * secondRational.getDenominator() -
        secondRational.getNumerator() * this.getDenominator(),
        this.getDenominator() * secondRational.getDenominator());
  }

  public Rational multiply(Rational secondRational) throws DenominatorZeroException {
    return new Rational(this.getNumerator() * secondRational.getNumerator(),
        this.getDenominator() * secondRational.getDenominator());
  }

  public Rational divide(Rational secondRational) throws DenominatorZeroException {
    return new Rational(this.getNumerator() * secondRational.getDenominator(),
        this.getDenominator() * secondRational.getNumerator());
  }

  @Override
  public double doubleValue() {
    return numerator * 1.0 / denominator;
  }

  @Override
  public float floatValue() {
    return (float)doubleValue();
  }

  @Override
  public long longValue() {
    return (long)doubleValue();
  }

  @Override
  public int intValue() {
    return (int)doubleValue();
  }

  @Override
  public int compareTo(Rational r) {
    if (this.doubleValue() > r.doubleValue())
      return 1;
    else if (this.doubleValue() < r.doubleValue())
      return -1;
    else
      return 0;
  }

  @Override
  public String toString() {
    if (denominator == 1)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }

  @Override
  public boolean equals(Object r) {
    return ((Rational)r).doubleValue() == this.doubleValue();
  }
}


class DenominatorZeroException extends Exception {
  public DenominatorZeroException(String msg) {
    super(msg);
  }
}
