public class P1 {
    private int len;
    private int arr[] = { 2, 5, 7, 8, 22, 77, 88 };
    private boolean isFound = false;

    private void find(int num) {
        len = (0 + arr.length) / 2;
        if (num == arr[len]) {
            isFound = true;
        } else if (num > arr[len]) {

        } else if (num < arr[len]) {

        }
    }

    public static void main(String[] args) {
        P1 obj = new P1();
        obj.find(7);
        if (obj.isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}