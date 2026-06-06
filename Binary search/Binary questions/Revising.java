public class Revising {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[] ans = search(matrix, 37);

        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {

            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }

            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        // Check middle column of remaining 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // 1st quadrant
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }

        // 2nd quadrant
        if (target >= matrix[rStart][cMid + 1]
                && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }

        // 3rd quadrant
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }

        // 4th quadrant
        return binarySearch(matrix, target, rStart + 1,
                cMid + 1, cols - 1);
    }

    public static int[] binarySearch(int[][] matrix,
                                     int target,
                                     int row,
                                     int cStart,
                                     int cEnd) {

        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}