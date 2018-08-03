public class SelectionSort {
   public static void selectionSort(int[] list) {
      int fixed = 0;
      while (fixed < list.length) {
         for (int i = fixed + 1; i < list.length; i++) {
            if ( list[i] < list[fixed]) {
               int temp = list[i];
               list[i] = list[fixed];
               list[fixed] = temp;
            }
         }
         fixed++;
      }
   }
}
