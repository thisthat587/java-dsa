// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 7, 7, 7 };
        int arr[];
        int target = 7;
        arr = searchRange(nums, target);
        for (int n : arr) {
            System.out.print(n + "  ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (target == nums[mid]) {
                if (nums.length == 1) {
                    arr[0] = 0;
                    arr[1] = 0;
                    break;
                } else {
                    for (int i = mid; i < nums.length && nums[i] == target; i++) {
                        arr[1] = i;
                    }
                    for (int i = mid; i >= 0 && nums[i] == target; i--) {
                        arr[0] = i;
                    }
                }
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (arr[0] > arr[1]) {

            arr[0] = arr[0] + arr[1];
            arr[1] = arr[0] - arr[1];
            arr[0] = arr[0] - arr[1];

        }
        return arr;
    }
}