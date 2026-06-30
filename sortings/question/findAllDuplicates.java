
import java.util.ArrayList;
public class findAllDuplicates {
    public static ArrayList<Integer> FindAllDup(int[] arr){
        
            int i =0;
            while(i<arr.length){
                int correctIndex=arr[i]-1;
                if(arr[correctIndex]==arr[i]){
                    i++;
                }else{
                    swap(arr,i,correctIndex);
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int index=0;index < arr.length;index++){
                if(arr[index]!=index+1){
                    list.add(arr[index]);
                }
            }
            return list;
        }
    public static void main(String[] args) {
         int[] arr={3,2,2,3,4,5,6,2,1,4,5};
         System.out.println(FindAllDup(arr));
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }
}
