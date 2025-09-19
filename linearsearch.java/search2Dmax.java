

public class search2Dmax {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {3,5,6,7,8},
                    {9,8,7,6,5,4},
                    {12,43,54,65}};
                    System.out.println(max(arr));

    }
    public static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
     for(int[] ints : arr){
        for(int elements : ints){
            if(elements>max){
                max=elements;
            }
        }
     }
     return max;

        }
    }
    

