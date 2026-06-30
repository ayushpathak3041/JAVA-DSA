
import java.util.ArrayList;

// import java.util.ArrayList;

// public class findAllmiss {
//     // Function to find all missing numbers from the array
//     public static ArrayList<Integer> FindAllDispered(int[] arr){
//         int i = 0;
//         // Step 1: Cyclic sort logic
//         while (i < arr.length) {
//             int correct = arr[i] - 1; // correct index for current element (value-1) because start =0
            
//             // If current element is not at its correct index, swap it
//             // Example: value 3 should go to index 2
//             if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
//                 swp(arr, i, correct);
//             } else {
//                 // If already in correct position or duplicate found → move ahead
//                 i++;
//             }
//         }

//         // Step 2: Find missing numbers
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int index = 0; index < arr.length; index++) {
//             // If value at this index is not equal to index+1 → that number is missing
//             if (arr[index] != index + 1) {
//                 list.add(index + 1);
//             }
//         }

//         // Return list of all missing numbers
//         return list;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4,3,2,7,8,2,3,1};
//         System.out.println(FindAllDispered(arr)); // Expected Output: [5,6]
//     }

//     // Utility function to swap elements
//     private static void swp(int[] arr, int i, int correct) {
//         int temp = arr[i];
//         arr[i] = arr[correct];
//         arr[correct] = temp;
//     }
// }


public class findAllmiss{
    public static ArrayList<Integer> findAll(int[] arr){
          int i=0;
          while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;     
            }
          }
          ArrayList<Integer> list = new ArrayList<>();
          for(int index=0;index<arr.length;index++){
            if(arr[i]>0 && arr[index]!=index+1){
                list.add(index);
            }
          }
          return list;
    }  
       static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
      System.out.println(findAll(arr)); // Expected Output: [5,6]
    }
}