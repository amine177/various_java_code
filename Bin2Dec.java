import java.util.Scanner;


public class Bin2Dec {
  public static int bin2Dec(String binaryString)
  throws BinaryFromatException {
    if (!binaryString.matches("[01]*"))
      throw new BinaryFromatException("Not binary string");
    int result = 0;
    for (int i = 0; i < binaryString.length(); i++) {
      result += Math.pow(2, binaryString.length() - i - 1) *
        Character.getNumericValue(binaryString.charAt(i));
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args)
  throws Exception {
    System.out.println(bin2Dec("101"));
  }
}


class BinaryFromatException extends Exception {
  public BinaryFromatException(String message) {
    super(message);
  }
}
