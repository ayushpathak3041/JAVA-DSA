public class countingoccur {
    public static void main(String[] args) {
/*✅ Problem Statement: Counting Occurrence
👉 Goal:
Given a number (like 45535) and a digit (like 5), count how many times that digit appears in the number.
 */

    int a = 13224;
    int digit = 2; // digit to count
    int count = 0;
    while (a > 0) {
        int rem = a % 10;
        if (rem == digit) {
            count++;
        }
        a = a / 10;     // 1322.4---> 1322 string in int from float
    }
    System.out.println(count);


    // *****************************
    // how 123 --> 321

    int num=79532;
    int ans=0;
    while(num>0){
        int rem1=num%10;
        num=num/10;
         ans = ans*10 + rem1;
    
}       
System.out.println(ans);
    }
    
}
