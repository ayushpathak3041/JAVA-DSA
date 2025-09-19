import java.util.Arrays;

public class cyclic{
    public static void CyclicSort(int[] arr){
      int i=0;
      while(i<arr.length){
        int correctIndex = arr[i]-1;
        if(arr[correctIndex]==arr[i]){
            i++;
        }else{
            swap(arr,i,correctIndex);

        }
      }
    }
     public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int correctIndex) {
       int temp=arr[i];
       arr[i]=arr[correctIndex];
       arr[correctIndex]=temp;
    }
}