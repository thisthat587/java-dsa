// to find the minimum index of occurence of target element....

public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 9, 7, 6, 4, 3, 1 };
        int target = 3;
        // findInMountain(arr, target);
        if (findPeak(arr, target) == -1) {
            System.out.println("Not Found...");
        } else {
            System.out.println("Found at : " + findPeak(arr, target));
        }
    }

    public static int findPeak(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int result = findInAscPart(arr, target, 0, end);
        if (result == -1) {
            result = findInDescPart(arr, target, start, arr.length - 1);
        }
        return result;
    }

    public static int findInAscPart(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
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

    public static int findInDescPart(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
