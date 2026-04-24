public class pattern04 {
    public static void Print123(int n){
            for(int row=0;row<=n;row++){
                for(int cols=1;cols<=row;cols++){
                    System.out.print(cols);
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Print123(10);
    }
}
