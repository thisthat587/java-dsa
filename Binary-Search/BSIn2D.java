public class BSIn2D {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 15, 25, 35 }, { 25, 29, 37 } };
        int target = 35;
        binarySearchIn2D(arr, target);
    }

    static void binarySearchIn2D(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row;) {
            if (arr[i][col - 1] == target) {
                System.out.println(i + "," + --col);
                break;
                // return arr[i][col - 1];
            } else if (arr[i][col - 1] < target) {
                i++;
            } else {
                col--;
            }
        }
        // return -1;
    }
}
