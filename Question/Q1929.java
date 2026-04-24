// 🔹 LeetCode Problem: 1929. Concatenation of Array
// Question:
// Given an integer array nums of length n, 
// return an array ans of length 2n where:
// ans[i] = nums[i]       for 0 <= i < n
// ans[i+n] = nums[i]     for 0 <= i < n
// Basically, concatenate the array with itself.

import java.util.Arrays;

public class Q1929 {

    // Function to return concatenated array
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;         // Step 1: Find original array length
        int[] ans = new int[n * 2];  // Step 2: Create new array of size 2n

        // Step 3: Fill ans array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // First half
            ans[i + n] = nums[i];   // Second half (shifted by n)
        }

        return ans; // Step 4: Return final array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Example input

        // Step 5: Print result (need Arrays.toString for readable output)
        System.out.println(Arrays.toString(getConcatenation(arr)));

        // 🔹 Dry Run:
        // arr = {1,2,3,4}, n=4
        // ans = new int[8]
        // i=0 → ans[0]=1, ans[4]=1
        // i=1 → ans[1]=2, ans[5]=2
        // i=2 → ans[2]=3, ans[6]=3
        // i=3 → ans[3]=4, ans[7]=4
        // Final ans = [1, 2, 3, 4, 1, 2, 3, 4]
    }
}
