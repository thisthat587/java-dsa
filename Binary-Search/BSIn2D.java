import java.util.*;

public class BSIn2D {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 15, 25, 35 }, { 25, 29, 37 } };
        int target = 37;
        System.out.println(Arrays.toString(binarySearchIn2D(arr, target)));
    }

    static int[] binarySearchIn2D(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (col >= 0 && row < arr.length) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
