
// import java.util.Arrays;




// public class Bubble {
//     public static void main(String[] args) {
//         int[] arrrrrrr={2,3,4,2,53,546,7,5,342,1242,342};
//        Bubble(arrrrrrr);
//        System.out.println(Arrays.toString(arrrrrrr));
//     } 
//     public static void Bubble(int[] arr){
//         boolean swapped;
//         // outer loop for how many elements i have to sort
//         for (int i = 0; i < arr.length; i++) {
//             swapped=false;
//             // inner loop for swap i have to do
//             for(int j=1;j<arr.length-i;j++){
//                 if(arr[j]<arr[j-1]){
//                     int temp=arr[j-1];
//                     arr[j-1]=arr[j];
//                     arr[j]=temp;
//                     swapped=true;
//                 }
//             }
//              if(!swapped){
//             break;
//         }
//         }
       
//     }
    
// }

public class Bubble{
    public static void main(String[] args) {
        
    }
    public static void BubbleSearch(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
               int temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               swapped=true;
            }
            if(!swapped){
                break;
            }
        }
    }
}