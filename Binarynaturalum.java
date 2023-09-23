import java.util.*;

public class Binarynaturalum {

  public static void convertbinary(int n) {
    for (int i = 1; i <= n; i++) {
      String s = " ";
      int temp = i;
      while (temp != 0) {
        if ((temp & 1) == 1) {
          s = "1" + s;
        } else {
          s = "0" + s;
        }
        temp = temp >> 1;
      }

      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    int n = 10;
    convertbinary(2);
  }
}
