public class ceilingOfNum {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,12,15,16,19,23,25,28};
        int target=3;
        int ans = ceiling(arr,target);
        System.out.println("Index no. is "+ans);
        System.out.println(arr[ans]);
        
    }

//_____________________________________________

// return the smallest index number which greater or equal to the target
public static int ceiling(int[] arr,int target){
   int start=0;
   int end=arr.length-1;
   while(start<=end){

    // what is target is greater than last element of arr
    // then just return -1;
    if(target>arr[arr.length-1]){
        return -1;
    }
    int mid = start+(end-start)/2;
    if(target>arr[mid]){
        start=mid+1;
    }
    else if(target<arr[mid]){
        end=mid-1;
    }else{
        return mid;
    }

   }
   return start;

}
}
/*
Ceiling of a Number (smallest number >= target)

Example:
arr = [2, 3, 5, 9, 14, 16, 18]
target = 15

-----------------------------------------
Step 1: Initial
Start → 0 (arr[0] = 2)
End   → 6 (arr[6] = 18)

mid = (0+6)/2 = 3 → arr[3] = 9
target (15) > 9 → move start to mid+1

-----------------------------------------
Step 2:
Start → 4 (arr[4] = 14)
End   → 6 (arr[6] = 18)

mid = (4+6)/2 = 5 → arr[5] = 16
target (15) < 16 → possible ans → move end to mid-1

-----------------------------------------
Step 3:
Start → 4 (arr[4] = 14)
End   → 4 (arr[4] = 14)

mid = (4+4)/2 = 4 → arr[4] = 14
target (15) > 14 → move start = mid+1

-----------------------------------------
Step 4:
Start = 5, End = 4 → loop breaks

Now arr[start] = arr[5] = 16 → Ceiling = 16

-----------------------------------------
KEY RULES:
1. If target > mid → move start = mid+1
2. If target < mid → move end = mid-1
3. When loop ends, 'start' points to Ceiling
*/

