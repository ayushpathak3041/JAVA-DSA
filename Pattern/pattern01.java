public class pattern01 {
    public static void main(String[] args) {
        Pattern01(4);
    }
    public static void Pattern01(int n){
        for(int row=1;row<n;row++){
            for(int cols=1;cols<=row;cols++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}
