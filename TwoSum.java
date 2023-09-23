// [1,2,3,4], 6 => true
// [1,2,3,4], 10 => false

// [1,2,3,4], 6 => [3,1]
// [1,2,3,4], 10 => [-1,-1]
import java.util.*;

public class TwoSum {

  public static int[] isTwoSumPresent(int[] arr, int target) {
    // Boolean isPresent = false;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (target - arr[i] == arr[j]) {
    // return true;
    // }
    // }
    // }
    HashMap<Integer, Integer> myHashMap = new HashMap<>();
    int[] result = new int[2];
    // for (int i = 0; i < arr.length; i++) {
    // if (!myHashMap.containsKey(arr[i])) {
    // myHashMap.put(arr[i], arr[i]);
    // }
    // }

    for (int i = 0; i < arr.length; i++) {
      if (!myHashMap.containsKey(arr[i])) {
        myHashMap.put(arr[i], i);
      }
      if (myHashMap.containsKey(target - arr[i])) {
        result[1] = arr[i];
        result[0] = myHashMap.get(arr[target - arr[i]]);
      }
    }
    // int test = myHashMap.get(4);
    // System.out.println(test);

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int target = 5;
    int[] result = isTwoSumPresent(arr, target);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
