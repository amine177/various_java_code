public class ReverseArray {
   public static void main(String[] args) {
      java.util.Scanner input =
         new java.util.Scanner(System.in);
      int[] list = new int[10];
      for (int i = 0; i < list.length; list[i++] = input.nextInt());
      System.out.println(
            java.util.Arrays.toString(list));
      for (int i = 0; i < list.length / 2; i++) {
         list[i] += list[list.length - i - 1];
         list[list.length - i - 1] = list[i] - list[list.length - i - 1];
         list[i] -= list[list.length - i - 1];
      }
      System.out.println(
            java.util.Arrays.toString(list));
   }
}
