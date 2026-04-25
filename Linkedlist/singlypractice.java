public class singlypractice {

    private Node head;
    private Node tail;
    public int size ;

    public singlypractice(){
        this.size=0;
    }              // -----------------   upper is our linkedlist


    // THIS  is Node class 
    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
           this.value=value;
           this.next=next;
        }   
    }


    // NOW inserting element
    // condtion check head tail
    public void insert(int value , int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(tail==null){
            insertLast(value);
            return;
        }
       Node temp = head;
       for(int i = 1;i<index;i++){
        temp=temp.next;// current node 
       }
       Node node = new Node(value,temp.next);
       temp.next=node;

       size++;
        
    }
    
    private void insertLast(int value) {
        if(tail==null){
            insertFirst(value);// linkedlist khali hai jab hum last==first then we calling insertfirst
            return;
        }
      Node node= new Node(value);
     tail.next=node;
     tail=node;

    }

    private void insertFirst(int value) {
        Node node = new Node(value);
        node.next=head;
        head = node;

        if(tail==null){
            tail=head;
        }
    }


    public static void main(String[] args) {
        
    }
}
