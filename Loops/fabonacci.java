
import java.util.Scanner;

public class fabonacci {
// find nth faboancci number
//     Fib(0) = 0, Fib(1) = 1
// 📌 Fib(n) = Fib(n-1) + Fib(n-2)
// 📌 Recursive = Simple but slow
// 📌 Iterative = Fast and memory efficient
// 📌 Memoization = Best when many queries on Fibonacci
    public static int Fibonacci(int n){
        if (n <= 1) return n;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int Fib(int n){
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number to find fibonacci number");
        int n = sc.nextInt();
        // Base values for Fibonacci series: 0th and 1st
        int a = 0; // First Fibonacci number (0th index)
        int b = 1; // Second Fibonacci number (1st index)
        int count = 2; // Because we already have 0th and 1st terms
        // Loop runs until we reach the nth term
        while (count <= n) {
            int temp = b;     // Store current b before updating it  ( hume a ko b bnana hai s we have do swapping(temp))
            b = b + a;        // New b is sum of previous a and b (F(n) = F(n-1) + F(n-2))
            a = temp;         // a becomes the previous b (move one step forward)
            count++;          // Move to the next term
        }//Formula: F(n) = F(n-1) + F(n-2)
        System.out.println("Fibonacci number at position " + n + " is: " + b);
    }
}




