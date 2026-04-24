// 🔹 LeetCode Problem: 2011. Final Value of Variable After Performing Operations
// Question:
// You are given an array of strings "operations" where each operation is either "++X", "X++", "--X", or "X--".
// Initially, X = 0.
// - If the operation contains "++", then X is incremented by 1.
// - If the operation contains "--", then X is decremented by 1.
// Return the final value of X after performing all the operations.

public class Q2011 {

    // 🔹 Function to process all operations and return final X value
    public static int Find(String[] operation) {
        int X = 0; // Initial value as given in the problem

        // Step 1: Loop through each operation in the array
        for (String op : operation) {
            
            // Step 2: Check if the operation is increment (contains "++")
            if (op.contains("++")) {
                X++; // increase X by 1
            } 
            // Step 3: Otherwise, it must be decrement (contains "--")
            else {
                X--; // decrease X by 1
            }
        }

        // Step 4: Return final value of X after all operations
        return X;
    }

    public static void main(String[] args) {
        // Example input
        String[] arr = {"X++", "X++", "X--", "X--"};

        // Step 1: Call the function
        int ans = Find(arr);

        // Step 2: Print final value of X
        // Dry Run:
        // X = 0
        // "X++" → X = 1
        // "X++" → X = 2
        // "X--" → X = 1
        // "X--" → X = 0
        // Final Answer = 0
        System.out.println(ans); // Output: 0
    }
}
