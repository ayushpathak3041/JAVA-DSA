public class Q1 {
    // print n to 1;
    public static void main(String[] args) {
        Q2funRev(10);
        
    }
    static void Q1fun(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.println(n);
        Q1fun(n-1);
    }
    static void Q2funRev(int n){
        if(n==0){
            return;
        }
        Q2funRev(n-1);{
            System.out.println(n);
        }
    }
    
}
