public class InfiniteElement{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10,12,13,14,100,200,300,400,500,600};
        int target=100;
        System.out.println(SearchStartEnd(arr, target));   
    }
    public static int SearchStartEnd(int[]arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    public static int BinarySearch(int[] arr,int target,int start,int end){
        int ans=-1;
     while(start<=end){
        int mid = start+(end-start)/2;
        if(target>arr[mid]){
            start=mid+1;
        }
        else if(target<arr[mid]){
            end=mid-1;
        }else{
            ans=mid;
        }
     }
     return ans;
    }
}