public class linear {  
    public static void main(String[] args) {
        int [] arr={1,2,3,43,5,56,7,87,34,4,34};
        int target =0;
        int ans = linearSearch(arr, target);
        System.out.println(ans); 
    }    
    // also use boolean and give true false;
    // search in the array : return the index if item found 
    // otherwise if not found return -1;
    static int linearSearch(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }
        // if they want only element jus use for-each loop
        for(int index=0; index<arr.length;index++){
            // check for element at every index if it is = taerget
            int element=arr[index];
            if(element==target){
                System.out.println("you target is matched at index "+index);
                return index;
            }
        }
            return -1;

        }   
    }
    // ---------------------- LINEAR SEARCH NOTES ----------------------
//
// 1. Definition:
//    Linear Search is a simple searching algorithm where 
//    we check each element of the array one by one until
//    the target element is found or the array ends.
//
// 2. Time Complexity:
//    - Best Case: O(1) → if the target is at the first position.
//    - Worst Case: O(n) → if the target is at the last position or not present.
//    - Average Case: O(n).
//
// 3. Space Complexity:
//    - O(1) → because we only use a few variables, no extra space needed.
//
// 4. When to Use:
//    - When the array is small.
//    - When the array is unsorted (Linear Search works on both sorted and unsorted arrays).
//
// 5. Steps (Algorithm):
//    - Start from the first element.
//    - Compare each element with the target.
//    - If a match is found → return index / print found.
//    - If no match after checking all elements → target not present.
//
// 6. Limitations:
//    - Inefficient for large arrays compared to Binary Search.
//    - Checking each element makes it slower for big data.
//
// ----------------------------------------------------------------

