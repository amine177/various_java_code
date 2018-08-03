import java.lang.reflect.Array;
import java.util.Arrays;

public class MyString {
   private char[] value;

   public MyString(char[] chars) {
      this.value = new char[chars.length + 1];
      for (int i = 0; i < chars.length; i++)
         this.value[i] = chars[i];
      this.value[chars.length] = '\n';
   }

   public int length() {
      return this.value.length;
   }

   public MyString substring(int begin, int end) {
      char[] retchars = new char[end - begin + 1];
      for (int i = begin; i < end; i++)
         retchars[i] = this.value[i];
      retchars[retchars.length - 1] = '\n';
      return new MyString(retchars);
   }

   public MyString toLowerCase() {
      char[] retstr = new char[this.value.length + 1];
      for (int i = 0; i < this.value.length; ++i)
         retstr[i] = Character.toLowerCase(this.value[i]);
      retstr[retstr.length - 1] = '\n';
      return new MyString(retstr);
   }

   public boolean equals(MyString s) {
      if (s.length() == this.value.length) {
         for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != this.value[i])
               return false;
         return true;
      }
      else
         return false;
   }

   public char charAt(int i) {
      if (i < this.value.length && i > -1)
         return this.value[i];
      else
         return '\u0000';
   }

   public char[] toChars() {
      char[] retstr = new char[this.value.length];
      for (int i = 0; i < retstr.length; i++)
         retstr[i] = this.value[i];
      return retstr;
   }
   
   public static String[] split(String s, String regex) {
      String[] sp = s.split(regex);
      String[] sp1 = new String[2 * sp.length - 1];
      int j = 0;
      for (int i = 0; i < sp.length - 1; i++) {
         int pos = s.indexOf(sp[i]) + sp[i].length();
         sp1[j++] = sp[i];
         sp1[j++] = Character.toString(s.charAt(pos));
      }
      sp1[sp1.length - 1] = sp[sp.length - 1];
      return sp1;
   }

   public static void main(String[] args) {
      System.out.println(Arrays.toString("d?....?j#djf?".split("[.?#]")));
      System.out.println(Arrays.toString(split("d?....j?j#djf?", "[.?#]")));
   }
}
