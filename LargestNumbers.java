import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();
    list.add(22);
    list.add(new BigDecimal("2.33333333333"));
    list.add(new BigInteger("23433"));
    System.out.println("The largest number is: " + getLargestNumber(list));
  }

  public static Number getLargestNumber(ArrayList<Number> list) {
    if (list == null || list.size() == 0)
      return null;

    Number n = list.get(0);
    for (int i = 1; i < list.size(); i++)
      if (list.get(i).doubleValue() > n.doubleValue())
        n = list.get(i);
    return n;
  }
}
