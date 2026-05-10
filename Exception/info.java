
import javax.imageio.IIOException;

//Exception handling---->🎯
//                    -- is an unexpected event that occurs during program execution.
//                 -- it affects the flow of the program instr which can cause the program to terminate abnormally.

//  exception can occurs for many reasons. Some of them
//    1.invalid user input
//    2.Device failure
//    3.Loss of network connection
//    4.Physical limitations
//    5.Code errors
//    6.Opening an unavailable file

/// TYPE OF EXCEPTIONS 🎯
///    1.java runtime exceptions
///    2.java ioexception exceptions


///                  JAVA RUNTIME Exception🎯         (then it is your fault)

///--   A runtime exception happens due to a programming error. They are also known as (Unchecked exception)
///--   these exceptions are checked run time . some of common runtime excwption
//  Null pointer access(missing the initialization of variable)---> (NullPointerException)
//  Out-Of-bound array access--(ArrayIndexOutOfBoundsException)
//  Dividing a number by 0 - (ArithmaticException)


///                  JAVA IOEXCEPTION Exceptions🎯     

///    ---also known as (checked exception)
///    ---checked by (compiler at compile time)
///    ---Programmer is prompted to handle these exception
///    ---   .trying to open a file that does not exist result in ( FileNotFoundException)
///    ---   .trying to read past the end of a file
 
//                   try-catch block🎯
///    
///    -- handles exception and prevents the abnormal termination of program
///    try{
///          //code
///       }  
///    catch(exception){
///           //code
///       }     
/// 
/// 
/// --------------------------------------------------------------------------------------------------------------------------                          
public class info{
    public static void main(String[] args) {
        // int[] a = new int[5];
       // System.out.println(a[8]);     // ArrayIndexOutOfBoundsException ( now program stop)  runtime error
       // System.out.println("Hello");  // does not print it 
      //  System.out.println("hhh")  compile time error


    //   System.out.println("Hello");

      // we caatch put multiple catch block

    //   try {
    //       int result =5/0;     // arithmatic exception
    //       System.out.println(a[8]);  // arrayofindexoutofBound       
    //   } catch (ArrayIndexOutOfBoundsException e) {
    //     System.out.println("Tried to access the out of bound element");// catch ho gya error
    //   } catch (ArithmeticException e){
    //       System.out.println(e.getStackTrace());
    //       System.out.println(e.getMessage());
    //       System.out.println(e);
    //   }
     

    int[] a = new int[5];
    System.out.println("Hello");

    try {
          int result =5/0;     // arithmatic exception
          System.out.println(a[8]);  // arrayofindexoutofBound       
      } catch (ArrayIndexOutOfBoundsException  |  ArithmeticException | NullPointerException e) {//😎
        System.out.println("Handling the exception");// catch ho gya error
      } catch(RuntimeException e){// parent hai uper ke sab exceptions ka
            
      }
      catch (Exception e){  ///  all exceptions handled   (PARENT CLASS)
      }
    //   } catch (ArithmeticException e){
    //       System.out.println("Handling the exception");
    //   }
    System.out.println("Bye guys");  //  not ye bhi run hoga

    }
}