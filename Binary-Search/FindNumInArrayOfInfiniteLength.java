// Find a number in an Arrray of infinite length....

public class FindNumInArrayOfInfiniteLength {

    public static int findNum(int arr[], int target) {
        int start = 0;
        int end = 1;

        while (end < arr.length && arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
            if (end > arr.length) {
                end = arr.length - 1;
                break;
            }
        }
        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int arr[], int target, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 10, 12, 14, 15, 18, 20,22,34,45,56,67,87,88,89,90,111,223,340 };
        int target = 340;
        if (findNum(arr, target) != -1) {
            System.out.println("Found at " + findNum(arr, target));
        } else {
            System.out.println("Not Found");
        }
    }
}
