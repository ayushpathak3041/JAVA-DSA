//                     Multithreading
///
///  -- multithreading is feature of java that enables a program to run multiple threads simultaneously.
///  -- Allow tasks to execute in parellel and utilize the CPU more efficiently
///  -- THREAD--> smallest unit of program(lightweight)
///              -- Thread allow parallel execution of tasks
///              -- A process can have multiple threads 
///              -- Each threads runs independently but shares the same memory

  /*                MAIN PROGRAM
              (Restaurant Manager)
                        |
        Starts Multiple Threads (Chefs)
   ------------------------------------------------
   |                  |                |          |
   |                  |                |          |
Thread 1           Thread 2         Thread 3   Thread 4
 (Chef A)           (Chef B)         (Chef C)   (Chef D)
   |                  |                |          |
 run()              run()            run()      run()
 executes           executes         executes   executes
   \                  |                |        /
    \                 |                |       /
     -----------------------------------------
                    |
                    |
          Concurrent Execution
    */      

/*       
 1. when java program starts, one thread begins running
    immediately, which is called (main thread).
    this thread (responsible) for executing the (main method) of a program
*/

package multithreading;
 public class Test{
    public static void main(String[] args) {

      World world = new World();
      world.start();
       System.out.println("Hello"); 
      // System.out.println(Thread.currentThread().getName());// ye bta rha ki main thread run ho rha current me
    }
}