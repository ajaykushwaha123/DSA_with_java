// [-1,3,4,5,-7,-2]
//[-1,-7,-2,5,3,4]
public class Rearrange {

  public static int[] rearrangeNum(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        continue;
      }
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < 0) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          break;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 3, 4, 5, -7, -2 };
    int[] result = rearrangeNum(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
