import java.util.*;

public class BubbleSortP1 {

    public static void main(String[] args) {

        int[] arr = { 3, 54, 5, 6, 43, 3, 2, 5, 6, 6, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(sortArr(arr)));
    }

    static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
