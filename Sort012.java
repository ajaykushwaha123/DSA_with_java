public class Sort012 {

  public static int[] sort_0_1_2(int[] arr) {
    int zero = 0;
    int one = 0;
    int two = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        zero++;
      }
      if (arr[i] == 1) {
        one++;
      }
      if (arr[i] == 2) {
        two++;
      }
    }
    int index = 0;
    for (int i = 1; i <= zero; i++) {
      arr[index++] = 0;
    }
    for (int i = 1; i <= one; i++) {
      arr[index++] = 1;
    }
    for (int i = 1; i <= two; i++) {
      arr[index++] = 2;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 0, 0, 2, 1, 2, 1, 0, 0 };
    int[] result = sort_0_1_2(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
