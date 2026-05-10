public class BINARYevenodd {
    public static void main(String[] args) {
        // This program checks whether a number is EVEN or ODD using bitwise AND operation
        int n=84;
        int Bitmask = 1;
        
        // (n&1) performs bitwise AND between n and 1
        // If the last bit (LSB) is 0, the number is EVEN (result == 0)
        // If the last bit (LSB) is 1, the number is ODD (result == 1)
        // For n=84: binary is 1010100, LSB is 0, so it's EVEN
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            // If result is 1 (not equal to 0), the number is ODD
            System.out.println("ODD");
        }
    }
}
