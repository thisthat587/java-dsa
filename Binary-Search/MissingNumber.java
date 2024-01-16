public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(arr));
        // arr = sortArr(arr);

        // for (int num : arr) {
        // System.out.println(num);
        // }
    }

    static int[] sortArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int missingNumber(int[] arr) {
        arr = sortArr(arr);
        // for (int num : arr) {
        // System.out.println(num);
        // }
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 1 && arr[0] == 0) {
            return 1;
        } else if (arr.length == 1 && arr[0] == 1) {
            return 0;
        }
        int mid = 0;

        while (end >= start) {
            mid = start + (end - start) / 2;
            if (arr[mid] == mid) {
                if (mid == arr.length - 1) {
                    return arr.length;
                }
                start = mid + 1;
            } else {
                if (mid == 0 && arr[mid] != 0) {
                    return 0;
                } else if (arr[mid - 1] == mid - 1) {
                    return mid;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }
}
