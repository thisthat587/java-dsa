// to find the minimum index of occurence of target element....

public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 9, 7, 6, 4, 3, 1 };
        int target = 3;
        int result = findInMountain(arr, target);
        if (result == -1) {
            System.out.println("Not Found at.....");
        } else {
            System.out.println("Found at : " + result);
        }
    }

    public static int findInMountain(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                end = mid - 1;
            } else if (arr[mid] > target) {
                
            } else {

            }
        }
        return -1;
    }
}
