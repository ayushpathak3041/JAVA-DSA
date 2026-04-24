public class pattern28 {
    public static void Pattern28(int n){
         for(int i=0;i<2*n-1;i++){
            int totalCols=i<n ? i : 2*n-i;
            int Spaces = n-totalCols;
                for(int j=0;j<Spaces;j++){
                    System.out.print(" ");     
                }
                for(int k=0;k<totalCols;k++){
                    System.out.print("* ");
                }
                System.out.println();
         }
    }
    public static void main(String[] args) {
        Pattern28(8);
    }
}
