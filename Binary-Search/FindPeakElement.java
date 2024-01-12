public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 3, 2, 0 };
        int peak = findPeakElement(arr);
        System.out.println("Peak is at " + peak);
    }

    public static int findPeakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            // agar start<= end likhnge to infinite loop chal jyga kuki equal index pe
            // element check krne ka check hi nhi lga h...
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                // yaha pe end = mid+1 isliye nhi likha gya kuki mid pe bhi peak hone ki
                // possibility ho skti h cuz mid element aage wale se bada h aur ho skta h ki
                // pichhle wale se bhi bada ho.....
            } else {
                start = mid + 1;
                // aur yha pe start = mid +1 isly likha gya kuki jab mid element mid+1 se chhota
                // hga to mid pe peak hone ki posssibility bachti hi nhi h
            }
        }
        return start;
    }
}
