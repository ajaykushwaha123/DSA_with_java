//[1,2,6,4,5]
//[1,2,3,1,8,8]
//ans=[1,2,3,4,5,6]
import java.util.*;

public class Union {

  public static Integer[] unionTwoNum(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> uni = new HashMap<>();
    HashMap<Integer, Integer> intsec = new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
      if (!uni.containsKey(arr1[i])) {
        uni.put(arr1[i], arr1[i]);
      }
    }
    for (int i = 0; i < arr2.length; i++) {
      if (!uni.containsKey(arr2[i]) && !intsec.containsKey(arr2[i])) {
        //intsec
        intsec.put(arr2[i], arr2[i]);
      }
    }
    // for(int key : uni.keySet()){
    //   return key;
    // }

    return uni.keySet().toArray(new Integer[0]);
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 6 };
    int[] arr2 = { 1, 2, 3, 1, 8, 6, 5 };
    Integer[] result = unionTwoNum(arr1, arr2);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
