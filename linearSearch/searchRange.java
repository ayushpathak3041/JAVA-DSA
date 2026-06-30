
import java.util.Scanner;

public class searchRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter start index");
        int start= sc.nextInt();
        System.out.println("Enter end index");
        int end=sc.nextInt();
        System.out.println("Enter target");
        int target=sc.nextInt();
        
        int [] arr={23,43,65,76,3,3,415,6,543,543,767};
        System.out.println(search(arr, target, start, end));
        
    }
    public static int search( int[] arr, int target, int start,int end){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=start; i<=end;i++){
            int element= arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;

    }
    
}
