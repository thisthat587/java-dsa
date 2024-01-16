// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
// Return the minimized largest sum of the split.
// A subarray is a contiguous part of the array.

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 5, 10, 8 };
        int k = 5;
        System.out.println(splitArray(arr, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int mid = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            end = end + nums[i];
        }
        while (start < end) {
            int pieces = 1;
            int currentSum = 0;
            mid = start + (end - start) / 2;
            for (int num : nums) {
                if (currentSum + num > mid) {
                    pieces++;
                    currentSum = num;
                } else {
                    currentSum += num;
                }
            }
            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}