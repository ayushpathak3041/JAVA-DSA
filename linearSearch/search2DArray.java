import java.util.Arrays;
public class search2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {3,5,6,7,8},
                    {9,8,7,6,5,4},
                    {12,43,54,65}};
                    int target=0;
        int[] ans=search(arr,target);    
        System.out.print(Arrays.toString(ans));        
        
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    System.out.println("element is at index "+arr[row][col]);
                    return new int[]{row,col};
                }

            }
            
        }
        return new int[]{-1,-1};

        
    }
    
}
// Why "return new int[]{row, col};" ?
//
// - In a 2D array search, we need to return TWO values (row index and column index).
// - But in Java, a method can return only ONE value at a time.
// - To solve this, we "pack" both row and col into a single array. basically humne int[] se array bnaya jo {row, col} ko contain kerega . uske baad humne array se string bna ke print kera diya
// - Example: if row=1 and col=3 → it returns {1, 3}.
// - Then in main(), we can print it as [1, 3] using Arrays.toString().
// - This way, both indices are returned together in one object (the int[] array).
