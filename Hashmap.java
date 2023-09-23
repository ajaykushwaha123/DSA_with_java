// [1,1,2,3,4,5,7,8];
//
import java.util.*;

public class Hashmap {

  public static int duplicate(int[] arr) {
    HashMap<Integer, Integer> dup = new HashMap<>();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (dup.containsKey(arr[i])) {
        count = arr[i];
        break;
      } else {
        dup.put(arr[i], arr[i]);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 0 };
    int result = duplicate(arr);
    System.out.print(result);
  }
}
