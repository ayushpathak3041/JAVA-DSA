
    public class Revising{
    public static void main(String[] args) {
        
    }
    public static int[] Search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length-1;
        int Rstart=0;
        int Rend=rows-1;
        int Cstart=0;
        int Cend=cols-1;
        int Cmid=cols/2;

        while(Rstart<=Rend-1){
            int Rmid=Rstart+(Rend-Rstart)/2;
            if(matrix[Rmid][Cmid]==target){
                return new int[]{Rmid,Cmid};
            }else if(matrix[Rmid][Cmid]>target){
                Rend=Rmid;

        if(matrix[Rstart][Cmid-1]==target){
          return BinarySearch(matrix,target,0,Rstart,Cmid-1);
        }
        if(matrix[Rstart+1][Cmid-1]==target){
            return BinarySearch(matrix, target,Rstart+1,Rstart+1,Cmid-1);
        }
        if(matrix[Cmid+1][cols-1]==target){
             return BinarySearch(matrix, target,Rstart+1,Cmid+1,Cmid-1);
        }
        if(matrix[Rstart+1][Cmid-1]==target){
          return BinarySearch(matrix, target,Rstart+1,Rstart+1,Cmid-1);
        }

    }
    // row wise search
    private static int[] BinarySearch(int[][] matrix, int target,int row, int Cstart, int Cend) {
        
        while(Cstart<=Cend){
            int Mid=Cstart+(Cend-Cstart)/2;
           
            }else{
                Rstart=Rmid;
            }
        }
        if(matrix[Rstart][Cmid]==target){
            return new int[]{Rstart,Cmid};
        }else if(matrix[Rstart+1][Cmid]==target){
            return new int[]{Rstart+1,Cmid};

        }
        return new int[]{-1,-1};
    }
}