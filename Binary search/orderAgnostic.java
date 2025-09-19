public class orderAgnostic {/*
 Order Agnostic Binary Search
   Ascending Array: [2, 4, 6, 8, 10]
   Descending Array: [10, 8, 6, 4, 2]
   Steps:
   1. Check order (ascending / descending )
   Check the order of array
     If arr[start] < arr[end] → Ascending
     Else → Descending

   2. Apply binary search rules accordingly
   3. Works for both types of sorted arrays
*/
public static void main(String[] args) {
    int []arr={12,23,34,45,56,67,78,89,90};
    int target=12;
    int ans=binarySearch(arr, target);
    System.out.println(ans);
    
}
public static int binarySearch(int []arr,int target){
    int start=0;
    int end=arr.length-1;
    if(arr[start]>arr[end]){// desending
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
    } else if(arr[start]<arr[end]){//Ascending
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
               start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
    }
    else{
        return 1;
    }
    return -1;
}
    
}
