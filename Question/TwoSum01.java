import java.util.Arrays;

public class TwoSum01 {
    public static void main(String[] args) {
        int[] arr={2,3,1,9,4};
        int target=13;
        int[] ans=TwoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    } 
    public static int[] TwoSum(int[] arr,int target){
             for(int i=0;i<arr.length;i++){
                for(int j=1;j<arr.length-1;j++){
                    if(arr[i]+arr[j]==target){
                        return new int[] {i,j};
                    }
                }
             }
             return new int[] {-1,-1};
    }
}
