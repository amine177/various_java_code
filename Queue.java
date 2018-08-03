import java.util.Arrays;

public class Queue {
   private int[] elements;
   private int size;

   Queue() {
      this(8);
   }

   Queue(int capacity) {
      elements = new int[capacity];
      this.size = 0;
   }

   public void enqueue(int v) {
      if (this.size >= elements.length) {
         int[] tmp = new int[elements.length * 2];
         System.arraycopy(elements, 0, tmp, elements.length, elements.length);
         elements = tmp;
      }
      elements[elements.length - 1 - (this.size++)] = v;
   }

   public int dequeue() {
      return elements[elements.length - this.size--];
   }

   public boolean empty() {
      return this.size == 0;
   }

   public int getSize() {
      return this.size;
   }
}
