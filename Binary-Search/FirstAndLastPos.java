// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

public class FirstAndLastPos {

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int flag=0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                flag++;
                if(flag==1){
                    arr[0] = mid;
                }
                if(flag>1){
                    arr[1] = mid;
                }
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 7, 7 };
        int arr[];
        int target = 7;
        arr = searchRange(nums, target);

        for (int n : arr) {
            System.out.print(n + ",");
        }
    }
}
