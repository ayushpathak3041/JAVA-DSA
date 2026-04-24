public class SetBit {
    public static void main(String[] args) {
        int n=34;
        int bitMask = 1;
        if((n & 1)==0){
            //  0 \
            // even
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }
    }
}
