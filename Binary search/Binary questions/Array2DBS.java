import java.util.Arrays;

public class Array2DBS {
    public static void main(String[] args) {
        int[][] matrix={
                    {10,20,30,40},
                    {15,25,35,45},
                    {18,27,37,48},
                    {19,29,39,50}};
        int target=37;
        System.out.println(Arrays.toString( search(matrix, target)));
;        
    }
    static int[] search(int[][] matrix, int  target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){

            if(matrix[r][c]==target){
            return new int[]{r,c};
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
