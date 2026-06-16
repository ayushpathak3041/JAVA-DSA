// import java.util.Arrays;

// public class Merge {
//     public static void main(String[] args) {

//         // Step 1: Create an unsorted array
//         int[] arr = {5, 4, 3, 2, 1};

//         // Step 2: Call merge sort function
//         // This will divide the array, sort it, and merge it back
//         arr = mergesort(arr);

//         // Step 3: Print the final sorted array
//         System.out.println(Arrays.toString(arr));
//     }

//     static int[] mergesort(int[] arr){

//         // Step 4: Base case
//         // If array has only one element, it is already sorted
//         if(arr.length == 1){
//             return arr;
//         }

//         // Step 5: Find the middle of the array
//         int mid = arr.length / 2;

//         // Step 6: Divide the array into left half
//         // Recursively apply merge sort on left part
//         int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));

//         // Step 7: Divide the array into right half
//         // Recursively apply merge sort on right part
//         int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

//         // Step 8: Merge both sorted halves
//         return merge(left, right);
//     }

//     private static int[] merge(int[] first, int[] second){

//         // Step 9: Create a new array to store merged result
//         int[] mix = new int[first.length + second.length];

//         // Step 10: Pointer for first array
//         int i = 0;

//         // Step 11: Pointer for second array
//         int j = 0;

//         // Step 12: Pointer for merged array
//         int k = 0;

//         // Step 13: Compare elements of both arrays
//         // and insert the smaller element into mix array
//         while(i < first.length && j < second.length){
//             if(first[i] < second[j]){
//                 mix[k] = first[i];
//                 i++; // move pointer of first array
//             } else {
//                 mix[k] = second[j];
//                 j++; // move pointer of second array
//             }
//             k++; // move pointer of merged array
//         }

//         // Step 14: If elements are left in first array, copy them
//         while(i < first.length){
//             mix[k] = first[i];
//             i++;
//             k++;
//         }

//         // Step 15: If elements are left in second array, copy them
//         while(j < second.length){
//             mix[k] = second[j];
//             j++;
//             k++;
//         }

//         // Step 16: Return the merged sorted array
//         return mix;
//     }
//}

// import java.util.Arrays;

// public class Merge{
//     public static void main(String[] args) {
//         int[] arr={1,32,4,56,4,2};
//         int[] ans=merge(arr);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] merge(int[] arr){
//         if(arr.length==1){
//             return arr;
//         }
//         int mid=arr.length/2;

//         int[] left=merge(Arrays.copyOfRange(arr, 0, mid));// left pe sorting aur merge hoga
//         int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));//   right pe sort aur merge hoga

//         return merge(left,right); // then merge hoga left aur right ka

//     }
//     static int[] merge(int[] first,int[] second){
//         int[] mix=new int[first.length+second.length];
//         int i=0;
//         int j = 0;
//         int k = 0;

//         while(i<first.length && j<second.length){
//             if(first[i]<second[j]){
//                 mix[k]=first[i];
//                 i++;
//             }else{
//                 mix[k]=second[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<first.length){
//             mix[k]=first[i];
//             i++;
//             k++;
//         }
//         while(j<second.length){
//             mix[k]=second[j];
//             j++;
//             k++;
//         }
//         return mix;
//     }
// }

import java.util.Arrays;

public class Merge{
    public static void main(String[] args) {
        int[] arr={23,5,6,4,32};
        int[] ans=merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] arr){

    // Base condition:
    // If array has only one element, it is already sorted
    if(arr.length == 1){
        return arr;
    }

    // Find middle index to divide array
    int mid = arr.length / 2;

    // Recursively divide left half
    int[] left = merge(Arrays.copyOfRange(arr, 0, mid));

    // Recursively divide right half
    int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

    // Merge the two sorted halves
    return mergeSort(left, right);
}


    private static int[] mergeSort(int[] left, int[] right){

    // Create new array to store merged result
    int[] mix = new int[left.length + right.length];

    // i -> left array pointer
    // j -> right array pointer
    // k -> merged array pointer
    int i = 0, j = 0, k = 0;

    // Compare elements from both arrays
    while(i < left.length && j < right.length){
        if(left[i] < right[j]){
            mix[k++] = left[i++];
        } else {
            mix[k++] = right[j++];
        }
    }

    // Copy remaining elements from left array
    while(i < left.length){
        mix[k++] = left[i++];
    }

    // Copy remaining elements from right array
    while(j < right.length){
        mix[k++] = right[j++];
    }

    // Return merged sorted array
    return mix;
}
