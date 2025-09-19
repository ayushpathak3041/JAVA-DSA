public class missing{
    public static int checkmissing(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]; // here if the correct is index , but in cyclic index and value shuld same 
            // but here also arr[correct]== arr[i] also equal if not then
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0; index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr={2,0,1,3,5};
        System.out.println(checkmissing(arr));
    }

    private static void swap(int[] arr, int i, int correct) {
       int temp=arr[i];
       arr[i]=arr[correct];
       arr[correct]=temp;
    }

   
}



/*
🔹 Cyclic Sort approach to find Missing Number (LeetCode 268)

1. Problem: Find the missing number from an array of size n 
   containing numbers from 0 to n.

2. Idea:
   - Every number should ideally be placed at index = value.
   - Example: 0 at index 0, 1 at index 1, ..., n-1 at index n-1.
   - Missing number will be the index where arr[index] != index.

3. Steps:
   a) Iterate over the array with index i.
   b) For each element arr[i], find its "correct index" (arr[i]).
   c) If arr[i] is inside range (arr[i] < arr.length) 
      AND not already in its correct position → swap.
   d) Else → move to next index (i++).
   e) After cyclic placement, scan the array:
        - If arr[index] != index → that index is the missing number.
   f) If all indices match → missing number is arr.length.

4. Complexity:
   - Time: O(n) → because each number is swapped at most once.
   - Space: O(1) → in-place swaps, no extra array used.

5. Example Dry Run: arr = {2,1,3,5}
   - After cyclic swaps → {5,1,2,3}
   - Check indices:
       index 0 → arr[0]=5 ≠ 0 → missing = 0 ✅
*/
