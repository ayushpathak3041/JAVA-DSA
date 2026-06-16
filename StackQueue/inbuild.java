import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class inbuild {
    public static void main(String[] args) {
 // 'inbuild Stack and Queue' 🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯👀👀👀👀👀👀👀👀


//         Stack<Integer> stack = new Stack<>();// sTACK --> CLASS
//         stack.push(32);
//         stack.push(43);
//         stack.push(7);
//         stack.push(99);
//         stack.push(23);
// //FILO
//         System.out.println(stack.pop());//23
//         System.out.println(stack.pop());//99
//         System.out.println(stack.pop());//7
//         System.out.println(stack.pop());//43
//         System.out.println(stack.pop());//32


          Queue<Integer> queue=new LinkedList<>();//Queue is Interface
          // Queue is an Interface does not make objent
          // class makes object
          // here the object we are creating of Linkdlist(class)
          // why
        //   Kyuki "LinkedList class" "Queue interface" ko implement karti hai.
        // Linkedlist:
        // implements List<E>, Queue<E>, Deque<E>
        //Queue<Integer> q = new Queue<>(); // ❌ Interface ka object nahi banta
        queue.add(21);
         queue.add(45);
          queue.add(90);
         queue.add(8);
          queue.add(1);
         queue.add(56);
         System.out.println(queue.peek());// gives head of linkedlist
         System.out.println(queue.remove());
        //  🔹 Stack = Plates ka stack 🍽️ (upar se nikalte ho)
//            Use Cases:
// Function Calls / Recursion
// Undo feature (Ctrl+Z)
// Browser Back button
// Expression Evaluation ((a+b)*c)
// DFS (Depth First Search)

        //  🔹 Queue = Line me khade log 🚶🚶🚶 (jo pehle aaya woh pehle jayega)       
//  Use Cases:
// Printer queue
// Ticket booking line
// CPU Scheduling
// BFS (Breadth First Search)
// Message/Request processing

// Queue -> FIFO (First In First Out)
// LinkedList implements Queue and Deque
Queue<Integer> q = new LinkedList<>();
   q.add(43);
   q.remove();
   q.peek();
// Use when only queue operations are needed
// add(), remove(), peek()
Deque<Integer> dq = new ArrayDeque<>();
// More flexible than Queue
// Can insert/remove from both ends
// Works as Queue + Stack
//Important Interview Point

// "ArrayDeque🎯" is usually preferred over (LinkedList) for "queue/stack" implementations because it has:
// Better cache locality
// Lower memory overhead
// Faster constant factors
// we will use it in trees(important)
     dq.add(2);
     dq.add(8);
     dq.add(9);
     dq.remove();
     dq.removeFirst();
     dq.removeLast();
     dq.addFirst(32);
     dq.addLast(43);
//     addFirst()
//         ↓
//       ┌────┬────┬────┬────┬────┐
//       │    │    │    │    │    │
//       └────┴────┴────┴────┴────┘
//         ↑       deque         ↑
//    removeFirst()        addLast()
//                              ↓
//                        removeLast()
//              

    }

}
