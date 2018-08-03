public class GenericMax
{
  public static void main(String[] args)
  {

    System.out.println(max("ABC", "A"));

    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(-2);
    GenericMax.<Integer>max(intStack);
  }

  public static <E extends Comparable<E>> E max(E o1, E o2)
  {
    if (o1.compareTo(o2) > 0)
      return o1;
    return o2;
  }

  public static <E extends Number> double max(GenericStack<E> stack)
  {
    return 0;
  }
}
