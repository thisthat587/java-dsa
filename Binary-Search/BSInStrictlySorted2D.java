import java.util.*;

public class BSInStrictlySorted2D {
    public static void main() {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target = 12;
        System.out.println(Arrays.toString(binarySearchIn2D(arr, target)));
    }

    static int[] binarySearchIn2D(int arr[][], int target) {
        int rows = 0;
        int col = arr.length - 1;
        while (rows < arr.length && col >= 0) {
            
        }
        return new int[] { -1, -1 };
    }
}
