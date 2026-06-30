import java.util.Arrays;

public class FindDuplicate {
       public static int FindDuplicateNumbers(int[] arr){
          int i=0;
          while(i<arr.length){
            if(arr[i]!=i+1){
                int correctIndex=arr[i]-1;
                if(arr[i]!=arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
          }
          return -1;
    }
        public static void swap(int[] arr, int i, int correctIndex) {
        int temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }
    public static void main(String[] args) {
         int[] arr={3,2,2,1,4,5};
         int ans=FindDuplicateNumbers(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
        
    }


}
