// [2,3,1,4,5,6,8,9,1,3,1,13,1,1]
// [2,3,4,5]
// 4 , index 7

public class Minjump {

  public static int getMinimumJumps(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    int n = 0;
    int count = 0;
    int havenotreached = 0;
    while (n < arr.length - 1) {
      if (arr[n] == 0) {
        if (n != arr.length - 1) {
          havenotreached = 1;
        }
        break;
      }
      if (arr[n] == 1 && (arr.length - 1 - n != 0)) {
        count += 1;
        n += 1;
      } else {
        if (arr[n] > (arr.length - 1 - n) && (arr.length - 1 - n != 0)) {
          count += 1;
          break;
        }
        int maxWeight = arr[n];
        int index = n;
        System.out.print(maxWeight + " " + index);
        for (int i = n + 1; i <= n + arr[n]; i++) {
          if ((arr[i] + i - n) > maxWeight) {
            maxWeight = arr[i];
            index = i;
          }
        }
        count += 1;
        n = index;
      }
      System.out.print(count + " " + n + " ");
    }
    if (havenotreached == 1) {
      return -1;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1 };
    int result = getMinimumJumps(arr);
    System.out.println(result);
  }
}
