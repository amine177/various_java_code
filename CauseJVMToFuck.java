public class CauseJVMToFuck {
  public static void main(String[] args) throws Exception {
    throw new OutOfMemoryError("We fucked guys!");
  }
}
