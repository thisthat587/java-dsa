import java.util.*;

public class BSInStrictlySorted2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target = 16;
        System.out.println(Arrays.toString(binarySearchIn2D(arr, target)));
    }

    static int[] binarySearchIn2D(int arr[][], int target) {
        int stRow = 0;
        int stCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr.length - 1;
        int row = (stRow + endRow) / 2;
        int col = (stCol + endCol) / 2;

        while (stRow <= endRow && stCol <= endCol) {
            row = (stRow + endRow) / 2;
            col = (stCol + endCol) / 2;
            if (arr[row][col] == target) {
                return new int[] { row, col };
            } else if (arr[row][col] < target) {
                if (col < arr[0].length - 1) {
                    stCol = col + 1;
                } else {
                    stRow = row + 1;
                    stCol = 0;
                }
            } else {
                if (col > 0) {
                    endCol = col - 1;
                } else {
                    endRow = row - 1;
                    endCol = arr[0].length - 1;
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
