// Given a sorted numsay of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

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

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        // int nums[] = { 85, 74, 63, 62, 51, 40, 39, 36, 34, 31, 29, 24, 21, 19, 16,
        // 14, 11, 8, 5, 4 };
        int target = 2;
        int index = searchInsert(nums, target);
        
        System.out.println("Insert Position of " + target + " is " + index);
    }

    static int searchInsert(int nums[], int target) {
        int pos = 0;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        if (nums[0] >= nums[end]) {
            System.out.println("numsay is sorted in Descending order.....");
            while (start <= end) {
                mid = (start + end) / 2;
                if (nums[mid] == target) {
                    pos = mid;
                    return pos;
                } else if (target < nums[mid]) {
                    if (mid != nums.length - 1) {
                        if (nums[mid + 1] < target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    start = mid + 1;
                } else {
                    if (mid != 0) {
                        if (nums[mid - 1] > target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    end = mid - 1;
                }
            }
        } else if (nums[0] <= nums[end]) {
            System.out.println("Array is sorted in Ascending order.....");
            while (start <= end) {
                mid = (start + end) / 2;
                if (nums[mid] == target) {
                    pos = mid;
                    return pos;
                } else if (target > nums[mid]) {
                    if (mid != nums.length - 1) {
                        if (nums[mid + 1] > target) {
                            pos = mid + 1;
                        }
                    } else {
                        pos = mid;
                    }
                    start = mid + 1;
                } else {
                    if (mid != 0) {
                        if (nums[mid - 1] < target) {
                            pos = mid;
                        }
                    } else {
                        pos = mid;
                    }
                    end = mid - 1;
                }
            }
        }
        return pos;
    }
}