/*
LeetCode Problem 1389: Create Target Array in the Given Order

👉 Problem Statement:
You are given two integer arrays nums and index of the same length.
We need to create a target array by inserting nums[i] at index[i] for each element.
Return the target array after all insertions.

📌 Example:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Process:
Step 1 → Insert 0 at index 0 → [0]
Step 2 → Insert 1 at index 1 → [0,1]
Step 3 → Insert 2 at index 2 → [0,1,2]
Step 4 → Insert 3 at index 2 → [0,1,3,2]
Step 5 → Insert 4 at index 1 → [0,4,1,3,2]
Output: [0,4,1,3,2]

---

👉 Key Concept:
- We need an array that supports "insert at index" (normal array doesn’t support shifting automatically).
- So we use ArrayList (because it can shift elements internally).
- After building, convert ArrayList back to int[] array.

This is a LeetCode problem. 🚀
*/

import java.util.*;  // import required for ArrayList and List

class Q1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        // Step 1: Create an ArrayList to dynamically insert values at given positions
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 2: Traverse both arrays simultaneously
        for (int i = 0; i < nums.length && i < index.length; i++) {
            /*
            list.add(position, value);
            - position = index[i] → where to insert
            - value = nums[i] → what to insert
            ArrayList automatically shifts existing elements to the right.
            */
            list.add(index[i], nums[i]);
        }

        // Step 3: Convert ArrayList to int[] because LeetCode expects int[]
        int[] target = new int[list.size()];   // create array of same size as list
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);   // copy element from list to array
        }

        // Step 4: Return the final target array
        return target;
    }
}
