public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 0, 1, 2, 4, 5 };
        // 6, 7, 0, 1, 2, 4, 5
        int target = 0;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                if (nums[mid] > nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] > nums[mid - 1]) {
                    return mid;
                }
                end = mid;
            }
        }
        return start;
    }
}