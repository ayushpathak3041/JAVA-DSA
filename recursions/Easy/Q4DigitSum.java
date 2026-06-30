public class Q4DigitSum {
    public static void main(String[] args) {
        System.out.println(DigitSum(1043)); 
        System.out.println(DigitProduct(109));   
    }
    static int DigitSum(int n){
        int Sum =0;
        while(n>0){
          int digit = n%10;  // you will find here 1043%10====3 remainder;
          Sum = Sum + digit;
          n = n/10;
        }
        return Sum;
    }
    static int DigitProduct(int n){
        if(n%10==n){
           return n;// we have to find the product that is why we have to multiply with zero
        }
        return (n%10)*DigitProduct(n/10);
    }
}
