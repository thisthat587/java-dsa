public class StudyPlan {

    static void timeRequired(int arr[],int n){
        int maxTime=arr[0];
        int totalTime=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    maxTime=arr[j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            totalTime=totalTime+arr[i];
        }
        int start=maxTime;
        int end=totalTime;
        int mid=(start+end)/2;

        
    }
    public static void main(String[] args){
        int timeForChapters[]={2,4,6,7,5};
        int N=3;
        timeRequired(timeForChapters,N);
    }
}
