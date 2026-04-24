public class Fibo {
    public static int FIBONACCI(int n){
        if(n<2){
            return n;
        }
        return FIBONACCI(n-1)+FIBONACCI(n-2);
    }
    public static Double Fibo(int n){
        Double ans=(2.23606797749979 +1)/Math.pow(2, n);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Fibo(50));
    }
}
