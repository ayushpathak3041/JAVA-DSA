///                            try-catch-finally block🎯
/// 
///        -- finally block alwys run            ho ya na ho exception
///        -- finallyblock does not execute 
///            . Use of System.exit() method       run nhi hoga finnally 
///            . An exception occurs in finally block
///            . death of a thread
public class finallyblock {
    public static void main(String[] args) {
        int[] a=new int[5];
        System.out.println("Hello World");
        try {
            System.out.println(a[3]);
        } catch (Exception e) {// run when there is exception
            System.out.println("Handles all Exceptions");
        } finally{//😎 always run if there is no exception
            System.out.println("I will run always");// exception ho ya na ho mai run hunga
        }
        System.out.println("Bye world");
        // try { 
        // } finally{
        // }
    }
}
