// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:
// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Example 3:
// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class SearchInsertPos {
    static int pos = 0;

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, 5, 6, 7, 9, 18, 35, 67, 68, 78, 89, 90, 99, 100, 111,
        // 113, 114, 333 };
        int arr[] = { 85, 74, 63, 62, 51, 40, 39, 36, 34, 31, 29, 24, 21, 19, 16,
                14, 11, 8, 5, 4 };
        int target = 3;
        int index = BinarySearchInASC(arr, target);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Index of Element : " + index);
        }
        System.out.println("Insert Position of " + target + " is " + pos);
    }

    static int BinarySearchInASC(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if (arr[0] >= arr[end]) {
            System.out.println("Array is sorted in Descending order.....");
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    if (mid != arr.length - 1) {
                        if (arr[mid + 1] < target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    start = mid + 1;
                } else {
                    if (mid != 0) {
                        if (arr[mid - 1] > target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    end = mid - 1;
                }
            }
        } else if (arr[0] <= arr[end]) {
            System.out.println("Arry is sorted in Ascending order.....");
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    if (mid != arr.length - 1) {
                        if (arr[mid + 1] > target) {
                            pos = mid + 1;
                        }
                    } else {
                        pos = mid;
                    }
                    start = mid + 1;
                } else {
                    if (mid != 0) {
                        if (arr[mid - 1] < target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}