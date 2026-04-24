
public class fibo {
    public static void main(String[] args){
        int findFiboNum= fibo(50);
        System.out.println(findFiboNum);
    }

     static int fibo(int n) {
        if(n<2){
            return n;
        }
       
        return fibo(n-1)+fibo(n-2);
}
}
