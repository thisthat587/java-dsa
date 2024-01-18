import java.util.*;

public class BubbleSortP1 {

  public static void main(String[] args) {
    // int[] arr = { 333, 54, 5, 6, 43, 3, 2, 5, 6, 6, 4, 3, 2, 1 };
    int[] brr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(Arrays.toString(sortArr(brr)));
  }

  static int[] sortArr(int[] arr) {
    int length = arr.length - 1;
    int j = 0;
    while (j < arr.length) {
      boolean isSwapped = false;

      for (int i = 0; i < length - j; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = temp;
          isSwapped = true;
        }
      }
      if (isSwapped == false) {
        return arr;
      }
      j++;
    }
    return arr;
  }
}
