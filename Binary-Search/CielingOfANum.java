// The concept of the "ceiling of a number" in the context of binary search in data structures and algorithms (DSA) usually refers to finding the smallest element in a sorted array that is greater than or equal to a given target value.

public class CielingOfANum {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 8, 9, 10, 14, 16, 19, 20, 35, 46, 56, 67, 78, 88 };
        // length=16 mid =16,7
        // int arr[] = { 123, 113, 111, 98, 96, 94, 76, 53, 52, 33, 12, 11, 9, 5, 3, 1 };
        // length=16 mid=53,7;
        int target = 11;
        int index = findCieling(arr, target);
        if (index == -1) {
            System.out.println("Cieling of number is not found.....\n");
        } else {
            System.out.println("Ceiling of " + target + " is " + arr[index]+"\n");
        }
    }

    static int findCieling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int index=0;
        if (arr[start] <= arr[end]) {
            System.out.println("\nArray is sorted in Ascending order.....");
            if (target > arr[end]) {
                return -1;
            }
            while (start <= end) {
                mid = (end + start) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    index=mid;
                    end = mid - 1;
                }
            }

        } else if (arr[start] >= arr[end]) {
            System.out.println("\nArray is sorted in Descending order.....");
            if (target > arr[0]) {
                return -1;
            }
            while (end >= start) {
                mid=(end+start)/2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    index=mid;
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}