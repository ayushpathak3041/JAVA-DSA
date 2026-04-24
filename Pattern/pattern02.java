public class pattern02 {
    public static void main(String[] args) {
        squarePattern(4);
    }
    public static void squarePattern(int n){
          for(int row=1;row<=n;row++){
            for(int cols=1;cols<=n;cols++){
                System.out.print("*");
            }
            System.out.println();
          }
    }
}
