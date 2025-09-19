public class info {
/*Initial Range: |--------------------|
               2                  899
mid = 54 → target > 54 → Search Right
New Range:              |-------------|
                        65           899
mid = 98 → target < 98 → Search Left
New Range:              |-----|
                        65   78
mid = 76 → target == 76 → FOUND ✅
*/
   /* public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,23,34,45,67,78,89,90,234,456,678,789};
        int target=45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}*/
/*
----------------------------------------
🔍 BINARY SEARCH - Quick Recap
----------------------------------------

➡️ Definition:
   Binary Search is a searching algorithm that works on sorted arrays
   by repeatedly dividing the search interval into two halves.

➡️ Requirements:
   - Array must be sorted (Ascending or Descending order).

➡️ Steps:
   1. Find the middle element.
   2. Compare target with middle element:
      - If equal → return index (element found).
      - If target < middle → search in left half.
      - If target > middle → search in right half.
   3. Repeat until start > end.

➡️ Time Complexity:
   - Best Case  → O(1)   (if middle element is target)
   - Worst Case → O(log n) (divide array by 2 each step)
   - Average Case → O(log n)

➡️ Space Complexity:
   - Iterative Binary Search → O(1)
   - Recursive Binary Search → O(log n) (because of recursion stack)

➡️ Example:
   Array = [10, 20, 30, 40, 50], target = 40
   mid = 30 → target > mid → search right → found 40.

----------------------------------------
⭐ Key Point:
Binary Search is efficient compared to Linear Search.
Use it only when data is sorted.
----------------------------------------
*/
//🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯
/*
------------------ Binary Search Recap ------------------

How to find the middle element:

1. Basic formula:
   int mid = (start + end) / 2;

2. Problem:
   If start + end is very large, it may cause integer overflow.

3. Safe formula (recommended):
   int mid = start + (end - start) / 2;

Example:
   Array = [10, 20, 30, 40, 50]
   start = 0, end = 4
   mid = start + (end - start) / 2
   mid = 0 + (4 - 0) / 2
   mid = 2
   So arr[mid] = 30 (middle element)

---------------------------------------------------------
*/
public static void main(String[] args) {
   int[]arr={1,2,4,6,8,90,123,334,654,768,879};
   int target=90;
   int ans=binarySearch(arr, target);
   System.out.println(ans);

   
}
public static int binarySearch(int[] arr, int target){
   int start=0;
   int end=arr.length-1;
   while(start<=end){
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
   return -1;
}
/// just tasting is mid value can we calculate with method

    public static void mid(int start, int end) {
    int mid=start+(end-start)/2;
   }
}
