public class FirstAndLastPos {
    
    public static int[] searchRange(int[] nums, int target) {
        int arr[]={0,1};
        return arr;
    }

    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int arr[];
        int target=8;
        arr=searchRange(nums,target);
        
        for(int n:arr){
            System.out.print(n+",");
        }
    }
}
