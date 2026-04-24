// 🔹 LeetCode Problem: 1431. Kids With the Greatest Number of Candies
// Question: 
// You are given an integer array "candies" where candies[i] represents the number of candies the i-th kid has.
// You are also given an integer "extraCandies". 
// Return a List<Boolean> where each element is true if, after giving all the extraCandies to the i-th kid, 
// they will have the greatest number of candies among all kids, otherwise false.

import java.util.ArrayList;

public class Q1431 {
    // 🔹 Function that returns a list of booleans
    // Each index tells whether that kid can have max candies or not if extra candies are added
    public static ArrayList<Boolean> FindCandies(int[] candies, int extracandy) {

        // Step 1: Find the maximum candies already with a single kid
        // why? → Because only if (current kid + extra) >= max, that kid can become the "greatest"
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);  
            // 🔹 Math.max() picks the larger between current max and candy
        }

        // Step 2: Create a list of boolean results
        ArrayList<Boolean> List = new ArrayList<>();

        // Step 3: Check for each kid whether they can reach or exceed max after adding extracandy
        for (int candy : candies) {
            // condition: (candy + extracandy) >= max ? true : false
            List.add((candy + extracandy) >= max);
            // 🔹 This adds either "true" or "false" to the List
        }

        // Step 4: Return the boolean list
        return List;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {2, 3, 4, 2, 4, 6};
        int extracandy = 3;

        // Output: [true, true, true, true, true, true]
        // Explanation:
        // max = 6
        // kid 1: 2+3=5 (not >=6) → false
        // kid 2: 3+3=6 (>=6) → true
        // kid 3: 4+3=7 (>=6) → true
        // kid 4: 2+3=5 (<6) → false
        // kid 5: 4+3=7 (>=6) → true
        // kid 6: 6+3=9 (>=6) → true
        System.out.println(FindCandies(arr, extracandy));
    }
}
