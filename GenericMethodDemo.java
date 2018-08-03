public class GenericMethodDemo<E extends String>
{
  public static void main(String[] args)
  {
    Integer[] integers = {1, 2, 3, 4, 5};
    String[] strings = {"London", "Paris", "New York", "Austin"};

    GenericMethodDemo.<Integer>print(integers);
    GenericMethodDemo.<String>print(strings);
  }

  public static <E> void print(E[] list)
  {
    for (E i : list)
      System.out.print(i + " ");
    System.out.println();
  }
}
