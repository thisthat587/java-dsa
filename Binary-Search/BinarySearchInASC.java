// Binary Search to find an element in an array sorted in Ascending order
public class BinarySearchInASC {
    private int arr[] = { 2, 5, 7, 8, 22, 77, 88 };
    int start = 0;
    int end = arr.length - 1;

    private boolean find(int num) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num < arr[mid]) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchInASC obj = new BinarySearchInASC();
        boolean isFound = obj.find(18);
        if (isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}