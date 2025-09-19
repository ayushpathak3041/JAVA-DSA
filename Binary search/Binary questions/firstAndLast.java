
import java.util.Arrays;

// Class name = firstAndLast (Java program entry point)
public class firstAndLast {
    public static void main(String[] args) {

        // A sorted array (important because Binary Search only works on sorted arrays)
        int arr[]={2,3,4,5,6,6,6,6,6,6,6,6,6,6,7,8,9,10};

        // Target element we want to search (first & last position of 6)
        int target=6;

        // Call SearchingRange() → returns [firstIndex, lastIndex] in an array
        int[] location=SearchingRange(arr,target);

        // Printing result using Arrays.toString() → example: [4, 13]
        System.out.println(Arrays.toString(location));
    }

    // -----------------------------------------------
    // Function: SearchingRange
    // Purpose: Finds the first and last index of target in sorted array
    // Returns: int[] with {firstIndex, lastIndex}
    // -----------------------------------------------
    private static int[] SearchingRange(int[] arr, int target) {

        // Default answer = {-1, -1} → means "not found"
        int []ans={-1,-1};

        // Find first position → pass "true"
        int start=FindPosition(arr,target,true);

        // Find last position → pass "false"
        int end=FindPosition(arr,target,false);

        // Store results in ans[]
        ans[0]=start;
        ans[1]=end;

        return ans; // return array {first, last}
    }

    // -----------------------------------------------
    // Function: FindPosition
    // Purpose: Modified Binary Search to find either:
    // 1) First occurrence of target (FindStartFirst = true)
    // 2) Last occurrence of target (FindStartFirst = false)
    // -----------------------------------------------
    private static int FindPosition(int[] arr, int target, boolean FindStartFirst) {  

        // Default = -1 (if not found)
        int ans=-1;

        // Binary Search starts
        int start=0;
        int end = arr.length-1;   // ✅ last index of array

        // Loop until search space becomes empty
        while (start<=end) { 

            // Midpoint formula (to avoid overflow)
            int mid=start+(end-start)/2;

            // Case 1: target is smaller than mid → go LEFT side
            if(target < arr[mid]){
                end=mid-1;
            }

            // Case 2: target is bigger than mid → go RIGHT side
            else if(target > arr[mid]){
                start=mid+1;
            }

            // Case 3: target == arr[mid] → potential answer
            else{
                ans=mid; // store index where target found

                // If we want FIRST occurrence → keep searching LEFT side
                if(FindStartFirst){
                    end=mid-1; 
                }

                // If we want LAST occurrence → keep searching RIGHT side
                else{
                    start=mid+1;
                }
            }
        }

        // Return the index (or -1 if not found)
        return ans;
    }
}


// import java.util.Arrays;

// public class firstAndLast {
//     public static void main(String[] args) {
//      int[] arr={5,7,7,7,7,8,8,10};
//         int target = 7;  
//        System.out.println(Arrays.toString(SearchRange(arr, target)));
        
//     }
//     public static int[] SearchRange(int []arr, int target){
//         int ans[]={-1,-1};
//         int start=FindPosition(arr,target,true);
//         int end=FindPosition(arr,target,false);
//         ans[0]=start;
//         ans[1]=end;
//        return ans;
//     }
//     private static int FindPosition(int[] arr, int target, boolean FirstStartIndex) {
//         int ans=-1;
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else if(target>arr[mid]){
//                 start=mid+1;
//             }else{
//                 ans=mid;
//                 if(FirstStartIndex){
//                     end=mid-1;
//                 }else{
//                     start=mid+1;
//                 }
//             }
//         }
//         return ans;
//     }
// }





