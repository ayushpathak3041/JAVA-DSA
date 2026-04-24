public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,4,76};
        int target=6;
        System.out.println(find(arr, target, 0));
    }
    static boolean find(int[] arr,int target,int index) {
        
           if(arr[index]==target || find(arr, target, index+1)){
            return true;
        } 
        }
    }
       
    

