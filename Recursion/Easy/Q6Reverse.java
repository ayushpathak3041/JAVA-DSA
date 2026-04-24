public class Q6Reverse {
    public static void main(String[] args) {
        Reverse(19);
    }
    static int Reverse(int n){
       while(n>0){
         int digit = n%10;
        int reverse=0;
        reverse=reverse*10+digit;
        n =n/10;
    }
       return reverse;
    }
}
