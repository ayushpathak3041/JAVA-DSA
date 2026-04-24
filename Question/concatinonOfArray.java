import java.util.Arrays;

public class concatinonOfArray{
public static int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int[] ans =new int[2*n];
        for(int i=0; i<n;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,5,7,8,9};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

}
 
