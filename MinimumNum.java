// Minimum length of arr is 1
// elements will be integer
// [4] => 4
// [3,5,6,23,1] => 1
// [-20,4,3,20] => -20

// import java.util.Arrays;

public class MinimumNum {

  public static int getMinimumNumber(int[] arr) {
    int count = arr[0];
    for(int i = 1;  i < arr.length; i++) {
      if(arr[i] < count) {
        count = arr[i];
      }
    }
    return count;
  //   Arrays.sort(arr);
  //   return arr[0];
  }

  public static void main(String[] args) {
    int[] arr = { 4, 5, 3, 6 };
    int result = getMinimumNumber(arr);
    System.out.println(result);
  }
}
