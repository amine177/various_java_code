public class StackOfIntegers {
   private int[] elements;
   private int size;
   private int index;
   public static final int DEFAULT_CAPACITY = 16;

   public StackOfIntegers() {
      this (DEFAULT_CAPACITY);
   }

   public StackOfIntegers(int capacity) {
      this.elements = new int[capacity];
      this.size = 0;
      this.index = -1;
   }

   public int pop() {
      //int ret = this.elements[index];
      //index--;
      //return ret;
      return this.elements[--size];

   }

   public void push(int value) {
      if (this.size >= this.elements.length) {
         int[] temp = new int[this.elements.length * 2];
         System.arraycopy(elements, 0,
               temp, 0, this.elements.length);
         elements = temp;
      }
      this.elements[size++] = value;
   }

   public int peek() {
      return this.elements[size - 1];
   }

   public boolean empty() {
      return this.size == 0;
   }

   public int getSize() {
      return size;
   }
}
