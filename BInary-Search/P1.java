public class P1 {
    private int arr[] = { 2, 5, 7, 8, 22, 77, 88, 99 };
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    private boolean find(int num) {
        boolean isFound = false;
        while (true) {
            if (start >= arr.length) {
                break;
            }
            if (end < 0) {
                break;
            }
            mid = (start + end) / 2;
            if (arr[mid] == num) {
                isFound = true;
                break;
            } else if (num > arr[mid]) {
                start = mid + 1;
                end = arr.length - 1;
            } else if (num < arr[mid]) {
                start = 0;
                end = mid - 1;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        P1 obj = new P1();
        boolean isFound = obj.find(4);
        if (isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}