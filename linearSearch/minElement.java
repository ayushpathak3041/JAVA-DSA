

public class minElement {
    public static void main(String[] args) {
        int[]  arr={12,32,12,1,32,6,7,6,9,80};
        System.out.print(minelement(arr));
    }
    public static int minelement(int[] arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
            
        }
        return ans;

    }
    
}
