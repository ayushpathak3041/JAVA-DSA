public class Info {
    public static void main(String[] args) {
        // inbuild Stack and Queue 


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
         
         


                                        

    }