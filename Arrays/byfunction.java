
import java.util.Arrays;

public class byfunction {
    public static void main(String[] args) {
        int[] num={3,4,6,67};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        // Arrays are mutable 
    }

    private static void change(int[] arr) {
       arr[0]=99;
}
/*
 here method has arr array , but calling with num 
 think....
 here num is pointing to [3,4,6,67]
 now arr will also point to [3,4,6,67]
 means if we change the value of arr . here num also will changed
 
 



 */
}
