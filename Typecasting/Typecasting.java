public class Typecasting {
    public static void main(String[] args) {
        // 1. (Narrowing) from (float to int)               bade se chhota
        float floatValue = 54.3f;
        int num1 = (int) floatValue;
        System.out.println("1. Narrowing float to int: (int)54.3f => " + num1);
        // Output: 1. Narrowing float to int: (int)54.3f => 54
        // Explanation: decimal part .3 is lost when float is explicitly cast to int.

        // 2. Explicit cast from int to byte                
        int a = 234;
        byte b = (byte) a;
        System.out.println("2. Explicit cast int to byte: (byte)234 => " + b);
        // Output: 2. Explicit cast int to byte: (byte)234 => -22
        // Explanation: 234 does not fit in byte range (-128..127), so overflow occurs.

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

      //  Widening (Safe)   —> byte → short → int → long → float → double            Widening: ✅ safe, no data loss (here we have enough space like int(4byte) to float(4byte))
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