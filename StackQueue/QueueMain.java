public class QueueMain{  
    public static void main(String[] args) throws Exception {// add exception because remove have exception
        CustomQueue queue = new CustomQueue();
        queue.insert(34);
        queue.insert(54);
        queue.insert(98);
        queue.insert(65);
        queue.insert(9);

        System.out.println(queue.remove());

        // this takes O(n) time complexity
        // that's why we use circular Queue
    }
}
