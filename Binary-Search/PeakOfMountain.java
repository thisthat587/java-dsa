public class PeakOfMountain {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 4, 6, 5, 3, 2, 1, 0 };
        int peak = BinarySearch(arr);
        System.out.println("Peak is at " + peak);
    }

    public static int BinarySearch(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[mid - 1]) {
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else {
                start = mid + 1;
            }
        } else {
            end=mid-1;
        }
        return 0;
    }
}
