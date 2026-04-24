public class pattern05{
    public static void Pattern(int n){
        for(int i=0;i<2*n-1;i++){// row
            int totalCols=i<n ? i : 2*n-i;
            for(int j=0;j<totalCols;j++){// cols
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(8);
    }
}