public class floor {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,12,15,16,19,23,25,28};
        int target=1;
        int ans = floor(arr,target);
        System.out.println(arr[ans]);
    }
    // greatest element in array which is smaller or equal to target

    private static int floor(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end ){
            // if target is smaller than first index element
            if(target<arr[0]){
                return -1;// this element is not in array it is smaller than first elemnt in arr
            }
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;
       
    }
    
}
