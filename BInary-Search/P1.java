public class P1 {
    private int arr[] = { 2, 5, 7, 8, 22, 77, 88 };
    int start = 0;
    int end = arr.length - 1;

    private boolean find(int num) {
        boolean isFound = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < num) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                isFound = true; 
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        P1 obj = new P1();
        boolean isFound = obj.find(76);
        if (isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}