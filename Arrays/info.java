public class info{
    public static void main(String[] args) {
        // Q: store  a roll no 
        int a=10;
        // Q: store a persons name
        String name="Ayush pathak";
        int [] roll_num=new int[5];
        // or int[] roll_num = {23,2,43,54,34};
        // because array contains similar datatype variable

        int[] ros; // declaration of arr  ay. ros is getting defined in stack
        ros=new int[5];// initialization .actually here object is being created in the memory(heap)
              

//  [Array object: stores references]
//    |      |      |      |
//    ↓      ↓      ↓      ↓
//  Obj1   Obj2   Obj3   Obj4 (these may be scattered across the heap)

//******************************************************* */

/*
    In Java:
    - Arrays are objects stored in the HEAP.
    - Heap memory is dynamically allocated by JVM.
    - Heap memory may NOT be continuous because JVM uses
      free memory blocks wherever available.
    - Unlike C/C++, Java manages memory using Garbage Collector.
    - JVM decides where to place the array, so it's not always
      in one big continuous block in physical memory.
    - Logically (from program view) it looks continuous, but 
      physically it may be scattered.

    Diagram:

        Heap Memory:
        +---+    +---+---+    +---+
        |10 |    |20 |30 |    |40 |
        +---+    +---+---+    +---+
          ↑        ↑   ↑        ↑
         arr[0]  arr[1] arr[2] arr[3]

    (Indexes are continuous for us, but data in HEAP
     may be stored in different free spaces internally)



    *********************************************************

    Example:
--------
int[] arr;           // Declaration -> arr is null by default
arr = null;          // Explicitly setting it to null
arr = new int[5];    // Now memory allocated in heap

Diagram:
---------
   Before Initialization:
   arr ---> null (no memory)

   After Initialization (new int[5]):
   arr ---> [0][0][0][0][0]
            (heap memory allocated)

Key point:
----------
Null array means only the REFERENCE exists, but no actual array object in heap.
*/

        
    }
}