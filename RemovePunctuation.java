public class RemovePunctuation {
  public static StringBuilder remove(String s) {

    char[] punct = { ',', '.', '!', '?', ';'};
    StringBuilder dummy = new StringBuilder(s);

    for (int i = 0; i < dummy.length(); i++) {
      if (charIsInArray(dummy.charAt(i), punct))
        dummy.deleteCharAt(i);
    }
    return dummy;
  }

  public static boolean charIsInArray(char c, char[] a) {
    for (int i = 0; i < a.length; i++)
      if (a[i] == c)
        return true;
    return false;
  }

}
