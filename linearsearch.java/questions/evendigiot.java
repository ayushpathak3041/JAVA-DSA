// public class evendigiot {
    
//     public static void main(String[] args) {
//         int[] nums={12,345,2,6,7896};
//         System.out.println(findnumbers(nums));      
//     }
//     public static int findnumbers(int[] nums) {
//         int count=0;
//         for(int n : nums){
//             if(even(n)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     private static boolean even(int n) {
//         if(digits(n)%2==0){
//             return true;
//         }
//         return false;
//     }
//     private static int digits(int n) {
//         int count = 0;
//         while(n>0){
//             n=n/10;
//             count++;
//         }
//         return count;
//     }
// }

 public class evendigiot {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        // find even digits (how many numbers have even digits)
        System.out.println(findingnum(arr));
        System.out.println(digits(-478374823));
        System.out.println(digits(0));
         System.out.println(digit2(34534));
        System.out.println(even(54646));// number of digits is 5 thats why it is not even it is odd number
    }
    private static int findingnum(int[] arr) {
        int count=0;
        for(int n : arr){
            if(even(n)){
                count++;
            }   
        }
        return count;      
    }
    private static boolean even(int n) {
       if(digits(n)%2==0){
        return true;
       }
       return false;
    }
    public static int digit2(int n){
         if(n<0){
            n=n*-1;
        }
           return (int)(Math.log10(n))+1;             // n = 9 → log10(9) ≈ 0.95 → floor(0.95) = 0 → +1 = 1 digit

//          🤘🤘🤘🤘🤘🤘🤘🤘🤘                                         //n = 123 → log10(123) ≈ 2.08 → floor(2.08) = 2 → +1 = 3 digits

//                                                    n = 1000 → log10(1000) = 3 → +1 = 4 digits
    }

    private static int digits(int n) {
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;
        }
        int count = 0;
      while(n>0){
          n=n/10;
        count++;
      }   
       return count;
    }
 }

