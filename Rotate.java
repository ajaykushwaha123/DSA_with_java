// [1,3,5,7,4]
// [4,3,5,7,1] 1st rotation,i=1
// [4,1,5,7,3] 2nd rotaion,i=2
// [4,1,3,7,5] 2nd rotaion,i=3
// [4,1,3,5,7] 2nd rotaion,i=4
public class Rotate {

  public static int[] rotateNum(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = arr.length - 1;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 4 };
    int[] result = rotateNum(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
