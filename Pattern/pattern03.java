public class pattern03 {
    public static void main(String[] args) {
        Triangle(10);
    }
    public static void Triangle(int n){
        for(int row=n;row>0;row--){
            for(int cols =1;cols<=row;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
