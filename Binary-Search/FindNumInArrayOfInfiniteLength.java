// Find a number in an Arrray of infinite length....

public class FindNumInArrayOfInfiniteLength {

    public static int findNum(int arr[], int target) {
        int index = -1;
        int start = 0;
        int end = 1;

        while (start <= end) {
            if (arr[end] == target) {
                return end;
            } else if (arr[end] < target) {
                start = end + 1;
                end = 2 * end;
            } else {
                end = end - 1;
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
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 23, 33, 35, 44, 45, 53, 56, 67, 86, 87, 89, 90, 92, 93, 95, 96, 98,
                99, 506, 546 };
        int target = 68;
        if (findNum(arr, target) != -1) {
            System.out.println("Found at " + findNum(arr, target));
        } else {
            System.out.println("Not Found");
        }
    }
}
