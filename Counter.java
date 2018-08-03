public class Counter {
  private int count;

  public Counter() {
  }

  public Counter(int initial) {

    this.count = initial;

  }

  public void increment() {
    
    this.count++;

  }

  public int getCount() {

    return this.count;


  }

  public void increment(int value) {

    this.count += value;

  }

  public void reset() {

    this.count = 0;

  }
}
