import java.util.Arrays;

public class StrictSearch2DArray {
    public static void main(String[] args) {    
        int[][] arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
        };
        int target=3;
        System.out.println(Arrays.toString(SearchRow(arr, target)));
    }
    public static int[] SearchRow(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int cStart=0;
        int cEnd=cols-1;
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        if(rows==1){
          return  BinarySearch(matrix, 0, cStart,cEnd,target);
        }
        // run the loop till two rows are remaining 
        while(rStart<(rEnd-1)){ // this loop run only for rStart,rStart+1 // while this is true it will have more then two rows which have to eliminate

            int Rmid=rStart+(rEnd-rStart)/2;
            if(matrix[Rmid][cMid]==target){
                return new int[]{Rmid,cMid};
            }
            if(matrix[Rmid][cMid]<target){
                // ignore the above rows
                rStart=Rmid;
            }
            else{
                rEnd=Rmid;
            }
        }
        // now we have two rows
        // chech whether the target is in the col of rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        // otherwise search in 1st half
         // otherwise search in 2nd half
          // otherwise search in 3rd half
           // otherwise search in 4th half


         // otherwise search in 1st half
         if(target<=matrix[rStart][cMid-1]){
            return BinarySearch(matrix, rStart, 0, cMid-1, target);
         }
         // otherwise search in 2nd half
          if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
             return BinarySearch(matrix, rStart, cMid+1, cols-1, target);
         }
          // otherwise search in 3rd half
           if(target<=matrix[rStart+1][cMid-1]){
             return BinarySearch(matrix, rStart+1, 0, cMid-1, target);
         }
           // otherwise search in 4th half
           else{
              return BinarySearch(matrix, rStart+1, cMid+1,cols, target);
           }
    }
    // search in the rows provided between cols provided
    public static int[] BinarySearch(int[][] matrix,int row,int cStart ,int cEnd,int target){
        while(cStart<=cEnd){
            int Rmid=cStart+(cEnd-cStart)/2;
            if(matrix[row][Rmid]==target){
                return new int[]{row,Rmid};
            }else if(matrix[row][Rmid]>target){
                cEnd=Rmid-1;
            }else{
                cStart=Rmid +1;
            }
        }
        return new int[]{-1,-1};
    }
}
