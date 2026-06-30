public class MountainTragetValue {
    public static void main(String[] args) {
        int []arr={1,3,5,7,4,2};
        int target=5;
        int ans=Search(arr, target);
        System.out.println(ans);

    }//----------------------------------------------------
    public static int Search(int[]arr,int target){
        int Peak=SearchPeak(arr);
        int FirstTry=AgnosticBS(arr,target,0,Peak);
        if(FirstTry!=-1){
            return FirstTry;
        }
        return AgnosticBS(arr, target, Peak+1,arr.length-1);
    }//----------------------------------------------------
    private static int SearchPeak(int[] arr){
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid] > arr[mid+1] ){
            end=mid;
        }else if(arr[mid]<arr[mid+1]){
            start=mid+1;
        }
    }
    return start;
    }//----------------------------------------------------

    private static int AgnosticBS(int[] arr, int target,int start, int Peak) {
         boolean isAsc=arr[start]< arr[Peak];
         
         while(start<=Peak){
            int mid=start+(Peak-start)/2;
            if(isAsc){
                if(target<arr[mid]){
                    Peak=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }

            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else if(target>arr[mid]){
                    Peak=mid-1;
                }else{
                    return mid;
                }

            }
         }
         return -1;
         
    }
}
       
    


    

