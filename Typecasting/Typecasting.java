/* 
package Typecasting;


public class Typecasting{
    public static void main(String[] args) {
        {
            // Scanner sc = new Scanner(System.in);
            // int num = sc.nextInt();
            // System.out.println(num);

            // Type casting from int to float
            int num1 = (int)(54.3f);
            System.out.println(num1);
            // automatic type promotion in expression
            int a=234;
            byte b=(byte)(a);
            System.out.println(b);

            // byte a1=40;
            // byte b1=50;
            // byte c=100;
            // int d=a*b/c;

            // System.out.println(d);

            //////////////////////////////////////////
             int num = 100;
        double result = num; // int to double automatically
        System.out.println("Widened: " + result); // Output: 100.0
        //////////////////////////////////////////////
        double value = 45.67;
        // int result1 = (int) value; // Explicit casting
        System.out.println("Narrowed: " + result); // Output: 45 (decimal lost)

      //  Widening (Safe)   —> byte → short → int → long → float → double      Widening: ✅ safe, no data loss (here we have enough space like int(4byte) to float(4byte))
      // Narrowing (Risky)(Lossy) —> double → float → long → int → short → byte      Narrowing: ⚠️ may lose data (e.g., decimals, overflow)
      

      //          TYPE PROMOTION 

      
// ✅ Example 1: byte + byte → inT

//       public class Main {
//     public static void main(String[] args) {
//         byte a = 10;
//         byte b = 20;
//         // byte c = a + b; ❌ Error: a + b promoted to int
//         int c = a + b; // ✅ Correct
//         System.out.println(c); // 30
//     }
// }

// ✅ Example 2: char + int
 
// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         double b = 5.5;
//         double result = a + b; // int promoted to double
//         System.out.println(result); // 15.5
//     }
// }

//🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗
// byte x = 10;
// byte y = 20;
// byte sum12 = x + y; // ❌ Error: x+y is int

//FIX 
// byte sum = (byte)(x + y); // 👈 Explicit cast required










        }
    }
}

*/