public class BinarySearch {
   public static int binarySearch(int[] list, int element) {
      int low = 0;
      int high = list.length - 1;
      int mid = (high + low) / 2;
      boolean isFound = false;
      while ( high >= low) {
         if (list[mid] > element)
            low = mid + 1;
         else if (list[mid] == element)
            return mid;
         else
            high = mid - 1;
         mid = (high + low) / 2;
      }
      return -1;
   }
}
