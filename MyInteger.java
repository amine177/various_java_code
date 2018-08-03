public class MyInteger {
   private int value;
   
   public MyInteger(int value) {
      this.value = value;
   }

   public boolean isEven() {
      return (this.value % 2 == 0);
   }

   public boolean isOdd() {
      return !this.isEven();
   }

   public static boolean isEven(MyInteger myInteger) {
      return myInteger.value % 2 == 0;
   }

   public static boolean isOdd(MyInteger myInteger) {
      return !MyInteger.isEven(myInteger);
   }

   public String toString() {
      return this.value + "";
   }

   public boolean equals(int value) {
      return this.value == value;
   }

   public boolean equals(MyInteger myInteger) {
      return this.value == myInteger.value;
   }

   public static int parseInt(char[] buff) {
      String s = new String(buff);
      return Integer.valueOf(s);
   }

   public static int parseInt(String s) {
      return Integer.valueOf(s);
   }
}
