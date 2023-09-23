import java.util.Arrays;

public class main {

  public static int[] sortArray(int[] arr) {
    Arrays.sort(arr);
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 8, 90, 1 };
    int[] result = sortArray(arr);

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
