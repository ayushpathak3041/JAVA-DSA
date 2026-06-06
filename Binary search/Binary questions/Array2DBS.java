import java.util.Arrays;

public class Array2DBS {
    public static void main(String[] args) {
        // 2D matrix sorted row-wise and column-wise
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {18, 27, 37, 48},
            {19, 29, 39, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    // Search for target in 2D sorted matrix using top-right to bottom-left approach
    // Time Complexity: O(m + n), Space Complexity: O(1)
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Start from top-right corner
        int r = 0;
        int c = cols - 1;
        
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } else if (matrix[r][c] > target) {
                // Current element is greater, move left
                c--;
            } else {
                // Current element is smaller, move down
                r++;
            }
        }
        
        // Target not found
        return new int[]{-1, -1};
    }
}
