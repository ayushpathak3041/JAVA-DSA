public class CircularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(43);
                queue.insert(5);

                        queue.insert(55);

                                queue.insert(98);

                                        queue.insert(34);

                                queue.Display();
                                System.out.println(queue.remove());  
                                queue.insert(6);
                                queue.Display();      
    } 
}
