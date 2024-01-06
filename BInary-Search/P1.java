public class P1 {
    private int len;
    private int arr[] = { 2, 5, 7, 8, 22, 77, 88 };
    private boolean isFound = false;

    private void find(int num) {
        len = (arr.length - 1) / 2;
        if(num==arr[len]){
            isFound=true;
        }
        else if (num > arr[len]) {
            for (int i = len+1; i < arr.length; i++) {
                if (arr[i] == num) {
                    isFound = true;
                }
            }
        } else if (num < arr[len]) {
            for (int i = len-1; i >= 0; i--) {
                if (arr[i] == num) {
                    isFound = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        P1 obj = new P1();
        obj.find(7);
        if(obj.isFound==true){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
            
        }
    }
}