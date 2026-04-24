public class Q3Fact {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }

     static int Fact(int i) {
        if(i==1){
            return 1;
        }
        return i*Fact(i-1);    
    }
    
}
